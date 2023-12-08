/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbpersistancesdesdonnées;
import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author felix
 */
public class GestionConnexion {
    private static final String driver = "org.gjt.mm.mysql.Driver";
    private static Connection singleton = null;
    public static Connection getConnexion() throws Exception{
        if (singleton == null){ 
            Class.forName(driver);
            singleton = DriverManager.getConnection("jdbc:mysql://localhost/gesfac","root","root");
        }
        return (singleton);
    }
    
    public static void liberer() throws Exception{
        singleton.close();
        singleton = null;
    }
    
}


// end page
