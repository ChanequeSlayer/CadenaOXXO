package cadena;
/**
 * Clase Trabajadores
 * Clase: Molde de todos los trabajadores
 * Es el que lleva todo el control en cuanto a la informacion y 
 * acciones de cada trabajador.
 * @version 1.0, 20/06/2021
 * @author Victor
 */
import javax.swing.JOptionPane;
import static  javax.swing.JOptionPane.OK_CANCEL_OPTION;

public class Trabajadores{
    //Declaramos los atributos de trabajadores
    private String id = new String();
    private String pass = new String();
    private String name = new String();
    //variable de confirmacion
    private int conf;
    //objeto para regresar el puesto de la persona.
    private String puesto = new String();
    //El constructor
     /**
 * Metodo Constructor
 * LLeva el control de incializar cada uno de los atributos anteriores
 * por defecto respecto al trabajor en general
 * @version 1.0, 20/06/2021
 * @author Victor
 */
    public Trabajadores(){
        id = "0123ABC";
        pass="0000";
        name="Gerente";
        conf=0;
        
    }
     /**
 * Metodo Sobrecargado de Trabajadores
 * LLeva el control de incializar cada uno de los atributos anteriores
 * por el usuario y da una confirmacion.
 * @version 1.0, 20/06/2021
 * @author Victor
 * @param String, id, pass, name, los usamos para confirmar el registro, y ver que
 * todo esta bien, si coinciden los datos.
 */
    //Metodo trabajadores para hacer el registro.
    public Trabajadores(String id, String pass,String name){
        this.id = id;
        this.pass = pass;
        this.name = name;
 
        conf = JOptionPane.showConfirmDialog(null,"Confirmacion de Registro \n"
                + "----------------------------- \n "
                + id +"\n"
                + pass+"\n"
                + name +"\n","Confirmacion",OK_CANCEL_OPTION);
        if(conf==0){
            JOptionPane.showMessageDialog(null,"El registro se ha llevado con exito");   
        }else{
            JOptionPane.showMessageDialog(null,"Se cancelara el registro");
            clean(id, pass, name);
        }
        
    }
     /**
 * Metodo Clean
 * Limpia los datos de usuario, como un destructor
 * @version 1.0, 20/06/2021
 * @author Victor
 * @param String id, pass, name, los usamos para limpiar los datos simplemente.
 */
    //Metodo para limpiar el registro
    public void clean(String id, String pass,String name){
      this.id="";
      this.pass="";
      this.name="";  
    }
     /**
 * Metodo Comprobacion
 * Comprueba los datos ingresados en general para verificar al empleado.
 * @version 1.0, 20/06/2021
 * @author Victor
 * @param String id, pass, los usamos para comprobar de igual forma si es gerente o no
 */
    //Compruba el inicio de sesion.
    public boolean comprobacion(String id, String pass){
        boolean user= false;
        if(id.equals("123ABCOXXO")&&pass.equals("oxxoxsiempre")||id.equals("SABRI0101")&&pass.equals("mecomiunasal")||
           id.equals("ROMXX")&&pass.equals("1deabril")||id.equals("ANA1212")&&pass.equals("121202") )
        {
            user = true;
        }
        return user;
    }
    //Verifica el puesto de la persona.
    public String puesto(String id,String pass){
        puesto="Empleado";
        
        if(id.equals("123ABCOXXO")||id.equals("SABRI0101")){
            puesto="Gerente";       
            }
        
        return puesto;
    }
}
