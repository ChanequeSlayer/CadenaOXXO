package cadena;
/**
 * Clase Gerente
 * Clase: Molde de gerente
 * Es el que lleva todo el control en cuanto a la informacion y acciones
 * del gerente
 * @version 1.0, 20/06/2021
 * @author Victor
 */
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
//Clase Gerente heredando de Trabajadores

public class Gerente extends Trabajadores {

    private String permisos = new String();
    private String nombre = new String();
    private String factura = "";
/**
 * Metodo Constructor
 * Todo este metodo constructor, hace distincion de cada gerente 
 * Pide dos string , referentes al id y passwor del gerente
 * @version 1.0, 20/06/2021
 * @author Victor
 * @param String, el id y pass para confirmar que gerente es
 */
    //Constructor
    public Gerente(String id, String pass) {
        if (id.equals("123ABCOXXO") && pass.equals("oxxoxsiempre")) {
            nombre = "Marco Antonio";
        } else {
            nombre = "Sabrina Mendoza";
        }
        permisos = "Avanzados";
    }
/**
 * Metodo mostrar
 * Sirve para mostrar los datos ingresados del gerente
 * @version 1.0, 20/06/2021
 * @author Victor
 * @param String, id, pass para poder visualizar los datos del mismo.
 */
    //Metodo para mostrar el usuario ingresado.
    public void showUser(String id, String pass) {
        JOptionPane.showMessageDialog(null, "Tu nombre de usuario es: " + nombre + "\n"
                + id + "\n"
                + pass + "\n");
    }
/**
 * Metodo Cobrar
 * Sirve para empezar a cobrar productos al cliente, generar el pdf
 * y cerrar el sistema
 * @version 1.0, 20/06/2021
 * @author Victor
 */
    //Metodo para cobrar los productos
    public void Cobrar() throws Errores {
        int d = 0;
        while(d != 3){
            //Menu de 3 opciones, comprar, facturar o salir
            try{
            d = Integer.parseInt(JOptionPane.showInputDialog("Cobro de Productos" + "\n"
                    + "---------------------------------" + "\n"
                    + "1)Comprar Productos\n"
                    + "2)Hacer Factura \n"
                    + "3)Salir \n"
                    + "Ingrese el numero o nombre de la opcion por favor \n"));
            
            switch (d) {
                case 1:
                    //Instancia un objeto de la clase Productos para llamar sus metodos
                    //Y hacer el cobro
                    Productos p = new Productos();
                    factura = p.listP();
                    JOptionPane.showMessageDialog(null, p.listP());
                    
                    break;
                case 2:
                    //Instancia un objeto de facturacion para generarla
                    Facturacion one = new Facturacion();
                    String n = JOptionPane.showInputDialog("Ingresa el nombre del cliente: ");
                    String a = JOptionPane.showInputDialog("Ingresa el apellido del cliente: ");
                    String dir = JOptionPane.showInputDialog("Ingresa la direccion del cliente: ");
                    String e = JOptionPane.showInputDialog("Ingresa la empresa del cliente: ");
                    String r = JOptionPane.showInputDialog("Ingresa el rfc del cliente: ");
                    Cliente two = new Cliente(n,a,dir,e,r);
                    one.Facturar(factura,two.informacion());
                    break;
                case 3:
                    //Sale del sistema
                    System.exit(0);
                    break;
                    

            }
         }catch(NumberFormatException axe){
                Errores e = new Errores("Posiblemente por ingresar texto donde NO debes");
            }   
        } 
    }

}
