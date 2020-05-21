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
public class EliminarObjetoJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1. Iniciar una transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //paso 2. sql select
        Persona persona1= em.find(Persona.class,8);
        
        //sincronizar la base de datos con la memoria
        em.remove(em.merge(persona1));
        
        tx.commit();
        //Cerramos el entity manager
        em.close();

    }
}
