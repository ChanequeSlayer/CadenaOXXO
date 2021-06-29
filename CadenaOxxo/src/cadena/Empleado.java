package cadena;
/**
 * Clase Empleado
 * Clase: Molde de empleado
 * Generado para dsitinguir entre empeleado y gerente, en este caso por su paga
 * ??FALTA IMPLEMENTAR??
 * @version 1.0, 20/06/2021
 * @author Victor
 * @see CLase padre Gerente
 */
public class Empleado extends Gerente{
    int paga;
/**
 * Metodo Constructor
 * Pide dos string , referentes al id y passwor del empleado, para señalarlo
 * @version 1.0, 20/06/2021
 * @author Victor
 * @param String, id y pass, que necesitamos para llenar con su info al empleado.
 * @see Clase Padre Gerente
 */
    public Empleado(String id, String pass) {
        //invoca al constructor de la clase padre.
        super(id, pass);
    }

}
