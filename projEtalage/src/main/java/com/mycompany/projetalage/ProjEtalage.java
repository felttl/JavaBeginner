/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetalage;

import com.mycompany.projetalage.interfaceGR.SaisieEtalage;
import com.sun.jdi.InterfaceType;
import javax.swing.*;
/**
 *
 * @author felix
 */
public class ProjEtalage {

    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Gestion d'Etalage");
        // classse de gestion de l'interface
        SaisieEtalage interfaceGR = new SaisieEtalage(); 
        fenetre.getContentPane().add(interfaceGR);
        fenetre.pack();
        // affichange de l'application
        fenetre.setVisible(true);
        // fermeture de fenetre sans bugs
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
