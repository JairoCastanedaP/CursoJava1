/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociaciones;

import domain.Persona;
import domain.Usuario;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author ENVYX360
 */
public class ClienteAsociacionesJPA {
    static org.apache.logging.log4j.Logger log= LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em=emf.createEntityManager();
        
        List<Persona> personas= em.createNamedQuery("Persona.findAll").getResultList();
        
        //cerramos la conexion
        
        em.close();
        
        //imprimir los objetos de tipo persona
        
        for(Persona persona:personas){
            log.debug("personas:"+persona);
            //recuperamos los usuarios de cada persona
            for(Usuario usuario:persona.getUsuarioList()){
                log.debug("Usuario: "+usuario);
            }
        }
    }
}
