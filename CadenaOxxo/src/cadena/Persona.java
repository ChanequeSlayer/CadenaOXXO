package cadena;
/**
 * Clase Abstracta Persona
 * Molde de la clase Cliente
 * @version 1.0, 20/06/2021
 * @author Victor
 */
public abstract class Persona {
    String nombre;
    String apellido;
    String direccion;
    String empresa;
    String RFC;
/**
 * Metodo Constructor
 * Todo este metodo constructor, inicializa lo que nos trae Cliente
 * @version 1.0, 20/06/2021
 * @author Victor
 * @param String nombre,apellido, direccion, empresa, rfc, todas esta spara poder
 * llevar la informaciona otro rumbo.
 */
    Persona(String nombre,String apellido,String direccion,String empresa,String RFC){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.empresa = empresa;
        this.RFC = RFC;
    }
/**
 * Metodo Informacion
 * Molde para sobreescribir despues
 * @version 1.0, 20/06/2021
 * @author Victor
 * @return String, solo que como no se implementa, retorna un "".
 */
    protected String informacion(){
        return "";
    }
}
