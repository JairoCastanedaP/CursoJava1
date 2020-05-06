package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {
        PersonaJDBC personaJDBC = new PersonaJDBC();
        List<Persona> personas = personaJDBC.select();

        for (Persona persona : personas) {
            System.out.println("persona:" + persona);
        }

//        Persona persona= new Persona();
//        persona.setNombre("Juaco");
//        persona.setApellido("Suarez");
//        persona.setEmail("cacorro");
//        persona.setTelefono("7748962");
//        
        // personaJDBC.insert(persona);
//          Persona persona= new Persona();
//          persona.setId_persona(3);
//          persona.setNombre("Mario");
//          persona.setApellido("Montoya");
//          persona.setEmail("jaja@gmail");
//          persona.setTelefono("789465");
//          
//          personaJDBC.update(persona);
//          
        Persona persona = new Persona();
        persona.setId_persona(3);
        personaJDBC.delete(persona);
    }
}
