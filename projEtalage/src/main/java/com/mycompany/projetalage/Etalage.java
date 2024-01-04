/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetalage;

/**
 *
 * @author felix
 * 
 * rajouter un étalage avec le truc graphique
 */
public abstract class Etalage {
    private int num;
    private float surface;
    public Etalage(int leNum, float laSurface) throws ErreurSurEtalage{
        if (leNum > 0 && laSurface > 0 && laSurface < 50){
            this.surface = laSurface;
            this.num = leNum;    
        } else {
            throw new ErreurSurEtalage(this.toString(leNum, laSurface));
        }
        
    }
    public Etalage(int leNum) throws ErreurSurEtalage{
        if (leNum > 0){
            this.num = leNum;
        } else {
            throw new ErreurSurEtalage("numéro invalide");
        }
    }
    public int getNum(){
        return this.num;
    }
    public float getSurface(){
        return this.surface;
    }
    /**
     * 
     * @return explicit
     */
    public float getSurfaceFacturée(){
        return 0;
    }
    public abstract float getCout(); // nous oblige a la coder dans les classes filles
    
    @Override public String toString(){ // car hérite de la classe object
        return String.format("Numéro : %d\nSurface : %f", this.num, this.surface);
    }
    protected String toString(int num, float surface){
        return String.format("Numéro : %d\nSurface : %f", num, surface);
    }    
    public void setNum(int leNum){
        num = leNum;
    }
    public void setSurface(float laSurface){
        surface = laSurface;
    }
    public abstract boolean chargerAvecId() throws ClassNotFoundException,Exception;
    
}
