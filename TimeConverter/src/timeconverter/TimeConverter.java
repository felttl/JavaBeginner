/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timeconverter;
import java.math.*;
/**
 *
 * @author felix
 */
public class TimeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int heureDépart = TimeConverter.d2convertisseur(9);
        int heureFin = TimeConverter.d2convertisseur(11);
        System.out.println(String.format("heure de depart du DT : %d\nheure de fin :%d", heureDépart, heureFin));
    }
    
    /**
     * heure PST = UTC+8
     * Heure française = UTC+1
     * @param heurePST 
     * @return  
     */
    public static int d2convertisseur(int heurePST){
        int res = (heurePST + 9 ) % 24;
        return res;
    }
    
    private static int mod(int num, int mod){
      int res;
      float times = (float)num / mod;
      res = num - (int)times * mod;
      return res;
  }
}
