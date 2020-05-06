package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);
            Persona persona= new Persona();
            persona.setId_persona(2);
            persona.setNombre("Legarda");
            persona.setApellido("uribe");
            persona.setEmail("cero@gmail");
            persona.setTelefono("875");          
            personaJDBC.update(persona);
            
            Persona nuevaPersona= new Persona();
            nuevaPersona.setNombre("transact");
            nuevaPersona.setApellido("ApellidoT");
            nuevaPersona.setEmail("tra@gmail.com");
            nuevaPersona.setTelefono("498615");
            personaJDBC.insert(nuevaPersona);
            
            conexion.commit();
            System.out.println("se ha hecho commit de la transaccion");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");         
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                    ex1.printStackTrace(System.out);
            }
        }
        
    }
}
