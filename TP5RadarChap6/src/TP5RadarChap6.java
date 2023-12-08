/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author felix
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * 
 * @author felix
 */
public class TP5RadarChap6 {
    // vitesse limite reele
    // vitesse utilisateur
    
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("additionneurV2");
        // classse de gestion de l'interface
        // rajouter un placeholder (paramètre a ajouter dans le textfield(textholder, longueurTextHolder)
        InterfacePannel interfaceGR = new InterfacePannel(); 
        fenetre.getContentPane().add(interfaceGR);
        fenetre.pack();
        // affichange de l'application
        fenetre.setVisible(true);
        // fermeture de fenetre sans bugs
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
}
