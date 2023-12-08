/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbpersistancesdesdonnées;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author felix
 */
public class DBpersistancesDesDonnées {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection laConnection;
        Class.forName("org?gjt.mm.mysql.Driver");
        laConnection = DriverManager.getConnection("jdbc:mysql://localhost/GesFac", "visiteur", "");
        // insertion dans la table "client" du client "2, Dubois, Emile
        //...
        // affichage du contenu de la table client
    }
    
}




// end page
