/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbpersistancesdesdonnées;
import java.sql.*;
/**
 *
 * @author felix
 */
class Client {
    // Les données
    private int num; // numéro du client
    private String nom; // nom du client
    private String prenom; // prénom du client
    // Les constructeurs
    public Client (int leNum) throws Exception{
    // le constructeur valorisera le nom et le prénom du client à partir de données présentes dans la base
    // on suppose que le numéro du client existe bien dans la base
        Class.forName("gesfac");
    }
    /*constructeur simple*/
    public Client (int leNum, String leNom, String lePrenom) {
        this.num = leNum;
        this.nom = leNom;
        this.prenom = lePrenom;
    }
    // Les accesseurs en consultation

    public int getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    
    // Les accesseurs en modification
    public void setNum(int nvNum){
        this.num = nvNum;
    }
    public void setNom(String nvNom){
        this.nom = nvNom;
    
    }
    public void setPrenom(String nvPrenom){
        this.prenom = nvPrenom;
    }
    // Les méthodes gérant la persistance
    public void insérer() throws Exception{
        // insére les données du client dans la base de données.
        try{
            Statement lOrdre;
            String sql = "INSERT INTO client"
                    + "(numClient, nom, prenom)"
                    + "Values"
                    + "("+this.num+", "+this.nom+", "+this.prenom+");";

            int nbLignes;
            lOrdre=VariableConnection.createStatement(); 
        } catch (ClassNotFoundException e){
            //System.out.println("insertions impossible");
            throw e;            
        }
    }
    // SQL GET data
    public void charger() throws Exception{
        // A partir du numéro du client cette méthode, valorise 
        // le nom et le prénom du client avec les données
        // contenues dans la base.
        if (this.num != 0){
            // requete ////////////////////////
            Connection objLaConnexion = GestionConnexion.getConnexion();
            Statement objRequete;
            String rsql = "SELECT * FROM client WHERE client.numClient = "+this.num;
            objRequete = objLaConnexion.createStatement();
            ResultSet ensLignes = objRequete.executeQuery(rsql);
            ////////////////
            boolean encore;
            encore = ensLignes.next()
            while (encore){
                encore = encore.next(); // déplace le curseur
                // gestion de la donnée :
                   

                enseligne.getInt("num");
                connexion.close();            
        } else {
            System.out.println("pas d'identifiant détecté pour le trouver dans las base de données")
        }

    }
    
    private void printint(int... a){
        for (int un : a){
           System.out.println(un); 
        }   
    }

}

// file > properties > ... > external jar file
