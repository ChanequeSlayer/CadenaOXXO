package cadena;
/**
 * Clase Facturacion
 * Clase: Generadora de facturacion
 * La clase encargada TOTALMENTE de generar el archivo final de ticket
 * @version 1.0, 20/06/2021
 * @author Victor
 */
import com.itextpdf.text.Image;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileOutputStream;

public class Facturacion {
// Generamos un objeto de tipo Document.
    Document documento = new Document();
    String lista = "";
    String cliente="";
/**
 * Metodo Constructor
 * Todo este metodo constructor, genera el Ticket final
 * Pide un String como parametro, ya que se le pasan los items comprados
 * @version 1.0, 20/06/2021
 * @author Victor
 * @param String productos, clientes, en este caso los usamos para generar el ticket
 */
    public void Facturar(String productos,String cliente) {
        //Hacemos referencia a nuestro atributo de lista, de la lista de productos que traemos.
        this.cliente = cliente;
        this.lista = productos;

        //Abrimos la excepcion para procurar que todo salga bien al momento
        //De generar el documento
        try {
            //Instanciamos un objeto de PdfWrite para generar el pdf de nuestro documento
            //Con el nombre Factura
            PdfWriter pdfw = PdfWriter.getInstance(documento, new FileOutputStream("Factura.pdf"));
            //Llamamos al metodo abrir para poder escribir en el documento
            documento.open();
            //Generadores de fuentes, personalizables
            Font fuente = new Font(FontFamily.HELVETICA);
            fuente.setSize(25);
            fuente.setColor(226, 42, 42);
            Font fuenteD = new Font(FontFamily.TIMES_ROMAN);
            fuenteD.setSize(12);
            fuenteD.setColor(99, 107, 3);

            //Se isntancia Objetos de tipo Image, para poder pegarlos en el pdf
            Image imagen = Image.getInstance("C:\\Users\\andres\\Desktop\\CadenaCO\\src\\imagenes\\oxxin.png");
            imagen.scalePercent(8, 8);
            imagen.setAbsolutePosition(10f, 750f);
            Image imagentwo = Image.getInstance("C:\\Users\\andres\\Desktop\\CadenaCO\\src\\imagenes\\table.png");
            imagentwo.scalePercent(12, 12);
            imagentwo.setAbsolutePosition(450f, 735f);
            
            //Instanciar objeto de tipo Parrafo
            Paragraph slice = new Paragraph("Cadena Comercial OXXO,S.A DE C.V\n"
                    + "VILLA UNION 9712 COLONIA GRANJAS \n"
                    + "R.F.C CCCF393222F", fuenteD);
            slice.setAlignment(Element.ALIGN_CENTER);
            //Se añaden los elementos que creamos
            documento.add(imagen);
            documento.add(imagentwo);
            documento.add(slice);
            //Hacer la tabla una imagen para poder moverla mejor.
            PdfPTable tabla = new PdfPTable(1);
            tabla.setWidthPercentage(10F);
            tabla.setHorizontalAlignment(Element.ALIGN_RIGHT);
            Paragraph title = new Paragraph("Facturacion Empresa OXXO", fuente);
            title.setAlignment(Element.ALIGN_CENTER);

            documento.add(title);
            Font fuenteL = new Font(FontFamily.COURIER);
            fuenteL.setSize(18);
            fuenteL.setColor(13, 50, 168);
            Paragraph abs = new Paragraph("\n\n\n\n\n\n"+lista, fuenteL);
            abs.setAlignment(Element.ALIGN_CENTER);
            documento.add(abs);
            
            
            
            
            Font client = new Font(FontFamily.COURIER);
            client.setSize(12);
            client.setColor(52, 11, 18);
            Paragraph omg = new Paragraph("\n\n\n\n\n\n"+cliente, client);
            omg.setAlignment(Element.ALIGN_LEFT);
            documento.add(omg);
            
            
            //Codigo de Barras, se genera a partir de esto
            BarcodeEAN code = new BarcodeEAN();
            code.setCodeType(code.EAN13);
            code.setCode("9781935182610");
            Image codeb = code.createImageWithBarcode(pdfw.getDirectContent(), null, null);
            codeb.scalePercent(150, 150);
            codeb.setAbsolutePosition(235f, 45f);
            documento.add(codeb);
            //

            documento.close();

            //Nuestros catch para tomar cualquier error de rutas, o de imagenes
            //u algun otro
        } catch (DocumentException ex) {
            System.out.println("No se esta generando bien el Documento");
        } catch (java.io.IOException ex) {
            System.out.println("Algo fallo");
        }
    }
}
