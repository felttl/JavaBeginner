/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetalage;


/**
 *
 * @author felix
 */
public class EtalagePermanent extends Etalage {
    private static float[] lesTarifsZones = {57.33f,65.25F,75.30F};
    private int numZone = 0;
    /**
     * chercher dans la abse de données l'élément correspondant
     * @param leNum
     * @throws ErreurSurEtalage 
     */
    public EtalagePermanent(int leNum) throws ErreurSurEtalage {
        super(leNum);
        this.numZone = 10;
    }
    /**
     * 
     * @param leNum
     * @param laSurface
     * @param laZone
     * @throws ErreurSurEtalage 
     */
    public EtalagePermanent(int leNum, float laSurface, int laZone) throws ErreurSurEtalage {
        super(leNum, laSurface);
        this.numZone = laZone;
    }    
    @Override public float getCout(){
        float res = EtalagePermanent.lesTarifsZones[0] / 2;
        if (this.getSurface() > 0.5){
            res = EtalagePermanent.lesTarifsZones[this.numZone] * this.getSurface();
        }
        return res;
    }
    @Override public String toString(){
        return super.toString()+"numZone : "+ this.numZone;
    }
    /**
     * méthode qui recherche dans la base l’étalage permanent ayant le numéro mémorisé dans la
     * variable d’instance « num » et qui valorise les autres variables d’instance si la recherche est
     * fructueuse
     * @return si valeur trouvé
     * @throws ClassNotFoundException
     * @throws Exception 
     */
    public boolean chargerAvecId() throws ClassNotFoundException, Exception{
        boolean trouve = false;
        
        
        
        
        return trouve;
    }
    
}
