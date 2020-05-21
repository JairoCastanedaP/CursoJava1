/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cascada;

import domain.Persona;
import domain.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author ENVYX360
 */
public class PersistenciaCascadaJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em= emf.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        //fase 1 crear objeto 
        //objeto en estado transitivo
        
        Persona persona1 = new Persona("Flaco","Can", "fc@gmail.com","321457841");
        
        //crear objeto usuario 
        
        Usuario usuario1 = new Usuario("fkUser","fk",persona1);
        
        // Persistir el objeto usuario
        
        em.persist(usuario1);
        
        //commit 
        tx.commit();
        
        em.close();
        
        //objetos en estado detached
        log.debug("objeto persona: "+persona1);
        log.debug("objeto usuario: "+usuario1);
        
        
    }
}
