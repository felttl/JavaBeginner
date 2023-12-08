/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4interfacegraphiquejaval2;

import javax.swing.JFrame;

/**
 *
 * @author felix
 */
// créer le fichier add.jar
public class Additionneur {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("additionneur");
        PAnneauAdd panneau = new PanneauAdd("0", "0");
        fenetre.getContentPane().add(panneau);
        fenetre.pack();
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
