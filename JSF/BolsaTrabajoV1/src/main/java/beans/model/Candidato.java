package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class Candidato {

    private String nombre;
    private String apellido;
    private String salarioDeseado;

    Logger log = LogManager.getRootLogger();

    public Candidato() {
        log.info("Creando objeto Candidato");
        this.setNombre("introduce tu nombre");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("Modificando la propiedad de nombre:" + this.nombre);
    }
    public String getApellido() {
        log.info("obteniendo el apellido");
        return apellido;
    }
    public void setApellido(String apellido) {
        log.info("modificando el apellido :"+this.apellido);
        this.apellido = apellido;
    }
    public String getSalarioDeseado() {
        return salarioDeseado;
    }
    public void setSalarioDeseado(String salarioDeseado) {
        log.info("Modificando la propiedad salarioDeseado"+this.salarioDeseado);
        this.salarioDeseado = salarioDeseado;
    }
}