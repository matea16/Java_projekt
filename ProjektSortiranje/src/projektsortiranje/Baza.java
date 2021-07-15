/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektsortiranje;

import java . sql . Connection ;
import java . sql . DatabaseMetaData ;
import java . sql . DriverManager ;
import java . sql . SQLException ;
import java.sql.PreparedStatement;


public class Baza {
    public static void selectAll(Connection conn){
        String sql = "SELECT id, ime, vrijeme FROM podaci";
        
        try{
            Statenment stmt = conn.createStatement();
            Statement = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("id") + "\t" + rs.getString("ime") + "\t" + rs.getInt("vrijeme"));
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void insert(String ime, int vrijeme, Connection conn){
        String sql = "INSERT INTO podaci(ime, godine) VALUES(?,?)";
        try{
            Statement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ime);
            pstmt.setString(2, Integer.toString(vrijeme));
            pstmt.executeUpdate();
        }
        catch(SQLException e){}
    }
    
    
    public static void main ( String [] args ) {
        String imeBaze = "podaci.db";
        String url = "jdbc:sqlite:" + imeBaze ;

        try ( Connection conn = DriverManager . getConnection ( url ) ) {
            if ( conn != null ) {
            DatabaseMetaData meta = conn . getMetaData () ;
            System . out . println ("Ime biblioteke za rad s bazom podataka " + meta . getDriverName () ) ;
            System . out . println ("Stvorena je nova baza.") ;
            }
        } catch ( SQLException e ) {
            System . out . println ( e . getMessage () ) ;
        } 
     
        String sql = "CREATE TABLE IF NOT EXISTS podaci (\n"
        + " ime text NOT NULL ,\n"
        + " vrijeme integer \n"
        + ");";
        try ( Connection conn = DriverManager . getConnection ( url );
            Statement stmt = conn . createStatement ()){ 
            if ( conn != null ) { 
                System.out.println("Opet uspostavljena veza.");
                stmt . execute ( sql ) ;
                
                //Ubacivanje u bazu.
                insert("Pero", 35, conn);
                insert("Marko", 55, conn);
                insert("Mislav",46, conn);
                insert("Karmen", 61, conn);
                insert("Maja",20, conn);
                
                selectAll(conn);
            }
        } 
        catch ( SQLException e ) {
            System . out . println ( e . getMessage () ) ; 
        } 

        
    }
   
}/*
