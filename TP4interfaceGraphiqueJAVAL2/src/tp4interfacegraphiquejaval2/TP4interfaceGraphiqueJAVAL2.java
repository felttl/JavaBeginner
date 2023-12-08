/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4interfacegraphiquejaval2;

/**
 *
 * @author felix
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//projet "projAdditionneur"
public class TP4interfaceGraphiqueJAVAL2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nouvelle fenetre
        JFrame fenetre = new JFrame("Additionneur");
        // cree dans la fenetre un conteneur d'éléments
        PanneauAdd panneau = new PanneauAdd("0", "0");
        
        fenetre.getContentPane().add(panneau);
        fenetre.pack();
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}





// end page