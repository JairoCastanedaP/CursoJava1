/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicloVidaJPA;

import domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author ENVYX360
 */
public class ActualizarObjetoJPA {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em= emf.createEntityManager();
        
        
        //Inicia la transaccion
        //Objeto en estado transitivo
        
        //paso 2 inicia la transaccion
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        
        //paso 2 inicia la transaccion
        Persona persona1= em.find(Persona.class,1);
        
        //3 termina la transaccion
        tx.commit();
        // termina la transaccion
        persona1.setNombre("Juaco");
        
        //inicia nueva transaccion
        EntityTransaction tx2= em.getTransaction();
        tx2.begin();
        
        //modificamos el objeto
        em.merge(persona1);
        tx2.commit();
        System.out.println(persona1);
        //cerramos el entity manager
        em.close();
        
    }
}
