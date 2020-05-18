/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import domain.Persona;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import servicio.PersonaServiceRemote;

/**
 *
 * @author ENVYX360
 */
public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        try {
            Context jndi= new InitialContext();
            PersonaServiceRemote personaService= (PersonaServiceRemote) jndi.lookup("java:global/sga_jee/PersonaServiceImpl!servicio.PersonaServiceRemote");
            List<Persona> personas = personaService.listarPersonas();
            
            for(Persona persona: personas){
                System.out.println(persona);        
            }
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
