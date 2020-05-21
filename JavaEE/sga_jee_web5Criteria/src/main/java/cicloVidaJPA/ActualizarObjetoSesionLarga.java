/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicloVidaJPA;

import domain.Persona;
import javax.persistence.*;

/**
 *
 * @author ENVYX360
 */
public class ActualizarObjetoSesionLarga {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1. Iniciar una transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso. ejecutamos SQL de tipo select
        Persona persona1 = em.find(Persona.class, 1);
        
        //Paso 3. setValue(nuevoValor)
        persona1.setEmail("jjuarez@mail.com");
        
        persona1.setEmail("j.juarez@mail.com");
        
        //Paso 4. Termina la transaccion 1
        tx.commit();


        //Cerramos el entity manager
        em.close();

    }
}
