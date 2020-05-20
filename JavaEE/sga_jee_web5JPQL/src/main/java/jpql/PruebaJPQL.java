/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpql;

import domain.Persona;
import domain.Usuario;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author ENVYX360
 */
public class PruebaJPQL {
    static Logger log=LogManager.getRootLogger();
    
    public static void main(String[] args) {
       String  jpql=null;
       String query=null;
         Query q = null;
       List<Persona> personas=null;
       
       Persona persona =null;
       Iterator iter = null;
       
       Object[] tupla=null;
       List<String> nombres=null;
       List<Usuario> usuarios=null;
       
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("SgaPU");
       EntityManager em =emf.createEntityManager();
       
       //1. Consulta de todos los objetos de tipo persona
       log.debug("\n 1. Consulta de todas las personas");
       jpql="select p from Persona p";     
       personas=em.createQuery(jpql).getResultList();
       //mostrarPersonas(personas);
       
       //2. Consulta de la persona con id =1
       log.debug("\n2.Consulta de la persona con id=1");
       jpql="select p from Persona p where p.idPersona=1";
       persona =(Persona) em.createQuery(jpql).getSingleResult();
       //log.debug("persona: "+persona);
       
       //3. consulta de la persona con nombre Juaco
       log.debug("\n3. Consulta de persona con nombre Juaco");
       jpql="select p from Persona p where p.nombre='Juaco'";
       personas=em.createQuery(jpql).getResultList();
       //mostrarPersonas(personas);
       
       //4.Consulta de datos individuales , se crea un arreglo(tupla) de tipo object de 3 columnas
       log.debug("\n4.Consulta de datos individuales");
       jpql="select p.nombre as Nombre, p.apellido as Apellido ,p.email as Email from Persona p";
       iter=em.createQuery(jpql).getResultList().iterator();
       
       while(iter.hasNext()){
           tupla=(Object[]) iter.next();
           String nombre=(String) tupla[0];
           String apellido=(String) tupla[1];
           String email=(String) tupla[2];
           //log.debug("nombre:"+nombre+" ,apellido:"+apellido+" , email: "+email);
       } 
       
       //5. Obtiene el objeto Persona y el id, se crea un objeto tipo Object con 2 columnas
       log.debug("5.Obtiene el objeto Persona y el id, se crea un objeto tipo Object con 2 columnas");
       jpql="select p, p.idPersona from Persona p";
       
       iter=em.createQuery(jpql).getResultList().iterator();
       
       while(iter.hasNext()){
           tupla=(Object[]) iter.next();
           persona= (Persona) tupla[0];
           int idPersona=(int) tupla[1];
           //log.debug("objeto Persona: "+persona);
           //log.debug("id_persona: "+idPersona);
       }
       
       //6.consulta de todas las personas
       log.debug("\n Consulta de todas las personas");
       jpql="select new domain.Persona(p.idPersona) from Persona p";
       personas=em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
        //7.regresa el valor minimo y maximo de
        log.debug("maximo y minimo");
        jpql="select min(p.idPersona) as MinId , max(p.idPersona) as MaxId,count(p.idPersona) as Contador from Persona p";
        iter= em.createQuery(jpql).getResultList().iterator();
        
        while(iter.hasNext()){
            tupla= (Object[]) iter.next();
            Integer idMin= (Integer) tupla[0];
            Integer idMax=(Integer) tupla[1];
            Long count = (Long) tupla[2];
            
            //log.debug("idMin: "+idMin +", idMax: "+idMax+", contador: "+count);
        }
        
        //8.Cuenta los nombres de las personas que son distintos
        log.debug("\n.Cuenta los nombres de las personas que son distintos");
        jpql="select count(distinct p.nombre) from Persona p";
        
        Long contador= (Long) em.createQuery(jpql).getSingleResult();
        //log.debug("Personas con nombre distinto: "+contador);
        
        //9.Concatena y convierte a mayusculas nombre y apellido
        log.debug("\nConcatena y convierte a mayusculas nombre y apellido");
        jpql="select CONCAT(p.nombre,' ',p.apellido) as Nombre from Persona p";
        nombres=em.createQuery(jpql).getResultList();
        for(String nombreCompleto:nombres){
            //log.debug("nombre completo: "+nombreCompleto);
        }
        
        log.debug("\n10. Obtiene el objeto persona con id igual al parametro proporcionado");
        int idPersona = 9;
        jpql = "select p from Persona p where p.idPersona = :id";
        q = em.createQuery(jpql);
        q.setParameter("id", idPersona);
        persona = (Persona) q.getSingleResult();
        //log.debug(persona);
        
        //11. Obtiene las personas que contengan una letra a en el nombre, sin importar si es mayusculas o minuscula
        log.debug("\n11. Obtiene las personas que contengan una letra a en el nombre, sin importar si es mayusculas o minuscula");
        jpql = "select p from Persona p where upper(p.nombre) like upper(:parametro)";
        String parametroString = "%a%";//es el caracter que utilizamos para el like
        q = em.createQuery(jpql);
        q.setParameter("parametro", parametroString);
        personas = q.getResultList();
        //mostrarPersonas(personas);
        
         //12. Uso de between
        log.debug("\n12. Uso de between");
        jpql = "select p from Persona p where p.idPersona between 1 and 3";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
        //13. Uso del ordenamiento
        log.debug("\n13. Uso del ordenamiento");
        jpql = "select p from Persona p where p.idPersona > 1 order by p.nombre desc, p.apellido desc";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
         //14. Uso de subquery 
        log.debug("\n14. Uso de subquery");
        jpql = "select p from Persona p where p.idPersona in (select min(p1.idPersona) from Persona p1)";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //15. Uso de join con lazy loading
        log.debug("\n15. Uso de join con lazy loading");
        jpql = "select u from Usuario u join u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        //mostrarUsuarios(usuarios);
        
        //16. Uso de left join con eager loading
        log.debug("16. Uso de left join con eager loading");
        jpql = "select u from Usuario u left join fetch u.persona";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);
    }

    private static void mostrarPersonas(List<Persona> personas) {
        
        for(Persona persona:personas){
            log.debug(persona);
        }
        
    }
     private static void mostrarUsuarios(List<Usuario> usuarios) {
        for(Usuario u: usuarios){
            log.debug(u);
        }
    }
}
