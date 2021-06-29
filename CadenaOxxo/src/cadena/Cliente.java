package cadena;
/**
 * Clase Cliente
 * Hereda de Persona
 *LLeva control de la informaion del cliente a facturar
 * @version 1.0, 20/06/2021
 * @author Victor
 * @see Clase padre Persona
 */
public class Cliente extends Persona{
    /**
 * Metodo Constructor
 * Todo este metodo constructor, hace distincion de cada Cliente
 *Pide cada informacion para facturar del cliente
 * @version 1.0, 20/06/2021
 * @author Victor
 * @param name, apellido, direccion,empresa, rfc, los pedimos despues al usuario
 * para poder usarlos en el formulario del ticket
 * @see clase padre Persona, para su metodo super Constructor
 * 
 */
    Cliente(String name,String apellido,String direccion,String empresa,String RFC){
      super(name,apellido,direccion,empresa,RFC);  
    }
/**
 * Metodo informacion
 * Genera el recuadro de informacion para el pdf a imprimir.
 * @version 1.0, 20/06/2021
 * @author Victor
 * @return String, una cadena de texto con la informacion del cliente
 * @see Clase Padre Persona
 */
    protected String informacion(){
                String info = "Nombre de la persona a facturar: "+nombre+"\n"
                + "Apellido:  "+apellido+"\n"
                + "Direccion:  "+direccion+"\n"
                + "Empresa: "+empresa+"\n"
                + "RFC:  "+RFC;
                return info;
    }
}
