/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetalage;
/**
 *
 * @author felix
 */
import java.sql.*;
public class EtalageSaisonnier extends Etalage {
    private static float leTarifJournalier=4.23f;
    private int nbJours;
    public EtalageSaisonnier(int leNum, float laSurface, int leNbJours) throws ErreurSurEtalage{
        super(leNum, laSurface);
        this.nbJours = leNbJours;
    }
    public EtalageSaisonnier(int leNum) throws ErreurSurEtalage{
        super(leNum);
        this.nbJours = 0;
    }
    @Override public float getCout(){
        return EtalageSaisonnier.leTarifJournalier * nbJours;
    }
    @Override public String toString(){
        return super.toString()+"nbjours : "+this.nbJours;
    }   
    /**
     * Méthode qui recherche dans la base l'étalage saisonnier ayant le numéro mémorisé dans 
     * la varaible d'instance "num" et qui valorise les autres variables d'instance si la recherche est 
     * fructueuse
     * @return si trouvé
     * @throws ClassNotFoundException erreur soulevé 
     * @throws Exception erreur soulevé
     */
    @Override public boolean chargerAvecId() throws ClassNotFoundException, Exception{
        boolean trouve=true;
        try{
            // driver a importer
            Class.forName("com.mysql.jdbc.Driver");
            try(Connection objConnection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root")){
                Statement bd=objConnection.createStatement();
                String laRequete = String.format("SELECT nums FROM etals WHERE nums=%d", this.getNum());
                ResultSet request=bd.executeQuery(laRequete);
                request.next();
                if (request.next()){
                    this.setNum(request.getInt(1));
                    this.setSurface(request.getFloat(2));
                    this.nbJours = request.getInt(3);
                } else {
                    System.out.println("valeur non trouvé dans la table SQL");
                    trouve = false;
                }
                    
                
            }
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return trouve;
        
    }
            


}
