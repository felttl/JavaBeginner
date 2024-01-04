/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  com.mycompany.projetalage.interfaceGR;
import com.mycompany.projetalage.ErreurSurEtalage;
import javax.swing.*;

/**
 *
 * @author felix
 */
public class TestSaisieEtalage {
    public static void main(String[] args) throws ErreurSurEtalage {
        SaisieEtalage écran;
        String message;
        écran = new SaisieEtalage();
        int réponse;
        réponse = JOptionPane.showConfirmDialog(null, écran, "saisie d'un étalage",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (réponse == JOptionPane.OK_OPTION){
            message = écran.getType()+" "+écran.getNuméro()+" "+écran.getSurface()+" "+écran.getInfoSupp();
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
