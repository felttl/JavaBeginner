/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package additionneur2lenecjavachap6;

/**
 *
 * @author felix
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ProjAdditionneurV2 extends JPanel{
    /**
     * constructeur de l'application
     * @param args 
     */
    public static void main(String[] args) {
  
        
        JFrame fenetre = new JFrame("additionneurV2");
        PanneauAddProf interfaceGR = new PanneauAddProf();
        fenetre.getContentPane().add(interfaceGR);
        fenetre.pack();
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
