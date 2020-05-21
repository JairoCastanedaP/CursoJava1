/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicloVidaJPA;

import domain.Persona;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author ENVYX360
 */
public class PersistirObjetoJPA {
  
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em= emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        
        //Inicia la transaccion
        //Objeto en estado transitivo
        Persona persona1 = new Persona("Pedro","luna", "p@gmail.com", "321478569");
        
        //paso 2 inicia la transaccion
        
        tx.begin();
        
        //ejecuta SQL
        em.persist(persona1);
        
        //Paso 4 commit/rollback
        tx.commit();
        
        //Objeto en estado detached
        
        
    }
}
