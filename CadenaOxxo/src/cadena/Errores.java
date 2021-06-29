package cadena;
/**
 * Clase Errores
 * Clase: Para modificar mensajes de posibles errores de ingreso de datos
 * Lleva control de excepciones
 * @version 1.0, 20/06/2021
 * @author Victor
 * @see Clase implementada Excepciones Propias
 */
import javax.swing.JOptionPane;
public final class Errores extends Throwable implements ExcepcionesPropias {
    String mensaje;
/**
 * Metodo Constructor
 * Inicializa y llamada al metodo de la clase padre que es Interfaz ExcepcionesPropias
 * LLama tambien al metodo mostrarMensaje Debajo.
 * @version 1.0, 20/06/2021
 * @author Victor
 * @param String, message, recibe un mensaje para despues mostrarlo
 */
    Errores(String message) {
        super(message);
        this.mensaje = message;
        mostrarMensaje();
    }
/**
 * Metodo mostrarMensaje
 * Crea la sentencia a mandar al usuario por su posible error
 * editable al momento
 * @version 1.0, 20/06/2021
 * @author Victor
 * 
 */
    @Override
    public void mostrarMensaje() {
        JOptionPane.showMessageDialog(null, "Se ha producido un error ten cuidado"+"\n"+"["+mensaje+"]");
    }
}
