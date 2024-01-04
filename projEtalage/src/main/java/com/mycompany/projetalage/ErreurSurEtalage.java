/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetalage;

/**
 * 
 * @author felix
 */
public class ErreurSurEtalage extends Exception {
    private String message;
    public ErreurSurEtalage(String leMessage){
        this.message = leMessage;
    }
    public String getMessage(){
        return message;
    }
    public String toString(){
        return "erreur d'instanciation"+message;
    }
}
