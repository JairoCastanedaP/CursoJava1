package datos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ENVYX360
 */
public class IntroduccionJDBC {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";           
        try {
             Connection conexion= DriverManager.getConnection(url,"root","system");
             Statement instruccion= conexion.createStatement();
             String sql= "select id_persona,nombre,apellido,email,telefono from persona";
             ResultSet resultado= instruccion.executeQuery(sql);
             
             while(resultado.next()){
                 System.out.print("\tid persona: "+resultado.getInt(1));
                 System.out.print("\t nombre: "+resultado.getString(2));
                 System.out.print("\tApellidos: "+resultado.getString(3));
                 System.out.print("\tEmail: "+resultado.getString(4));
                 System.out.print("\tTelefono: "+resultado.getString(5));
                 System.out.println(" ");
             }
           //cerrar conexion
           resultado.close();
           instruccion.close();
           conexion.close();
           
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }       
    }
}