/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4interfacegraphiquejaval2;

/**
 *
 * @author felix
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanneauAdd extends JPanel{
    private JTextField zoneTexte1 = new JTextField(10);
    private JTextField zoneTexte2 = new JTextField(10);
    private JLabel labelResultat = new JLabel();
    private JButton boutonCalculer = new JButton("Calculer");
    public PanneauAdd(String laValeurInit1, String laValeurInit2){
        super();
        this.setLayout(new GridLayout(3,2,5,5));
        this.add(new JLabel("1er nombre : "));
        this.add(zoneTexte1);
        this.add(new JLabel("2nd nombre : "));
        this.add(zoneTexte2);
        this.add(boutonCalculer);
        this.add(labelResultat);
        zoneTexte1.setText(laValeurInit1);
        zoneTexte2.setText(laValeurInit2);
    }
    
}
