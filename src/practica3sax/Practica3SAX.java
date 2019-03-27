
package practica3sax;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Practica3SAX {

             public static ManejadorSAX manejador;
             public static int opcion;

      public static void main(String[] args) {

          
          try {

              cargarSAX();
              
            do{
                mostrarMenu();
                  
                         opcion = pedirEntero("Elige una opción");

              switch(opcion){
                  
                  
                  case 1: 
                      mostrarEstructura();
                      break;
                      
                  case 2: 
                      cantidadArboles();
                      
                      break;
                      
                  case 3: 
                      mostrarArbolesEnteros();
                      break;
  
                  case 4: 
                      
                      break;
              }
              }while(opcion < 5);
     
          } catch (Exception e) {
              System.out.println("Valor incorrecto, vuelve a insertar otro valor" + e.getMessage());
              e.printStackTrace();
          }
    }
      
      
         ////////////////////////////////////////    (1) Mostrar Estructura //////////////////
      public static void mostrarEstructura() throws SAXException, ParserConfigurationException, IOException{
          //Este metodo nos rellena el ArrayList de Tags con el metodo getTags()
          List <String> listadoTags = manejador.getTags();
            //Se recorre un bucle for para sacar por pantalla todos los tags
            for(String a: listadoTags){
                System.out.println(a);
                }
                  
            System.out.println("");
            
      }
      
      
        ////////////////////////////////////////    (2) Mostrar Cantidad de Árboles //////////////
      public static void cantidadArboles() throws SAXException, ParserConfigurationException, IOException{
          //Nos muestra el contador de arboles, el cual se va sumando en el startElement si el nodo es Arbre
              System.out.println("Cantidad de Arboles: " + manejador.cantidadArboles);
              System.out.println("");

      }
      
////////////////////////////////////////    (3) Mostrar Árboles Completos //////////////////// 
      public static void mostrarArbolesEnteros() throws ParserConfigurationException, SAXException, IOException, IOException{
          
          SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
           
            ManejadorSAX manejador = new ManejadorSAX();
           
                          parser.parse(new File("datos.xml"), manejador);
              //Rellenamos el arrayList de arboles enteros con el metodo 
              //de getArboles(), metodo con el cual filtra y añade a un arrayList 
              //los arboles que tienen todos los atributos rellenados
              List<Arbol> arboloEntero =  manejador.getArboles();
        
             for (Arbol a: arboloEntero){
                 
                 System.out.println("\n" + a);
                 
             }
              
              
          System.out.println("");
          
      }
      
      
      /////////////////////////////////// Metodo para cargar el SAX/////////////
      public static void cargarSAX() throws ParserConfigurationException, SAXException, IOException{
           SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
           
             manejador = new ManejadorSAX();
            parser.parse(new File("datos.xml"), manejador);
            
            
      }
      
   
      
      public static void mostrarMenu(){
            System.out.println("[1] Mostrar estructura XML");
              System.out.println("[2] Mostrar cuantos árboles hay registrados");
              System.out.println("[3] Mostrar Árboles con contenido completo");
              System.out.println("[4] Parametrizar Árboles");
  
      }
      
    
      
      
      public static int pedirEntero(String texto) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		boolean error;
		do {
			try {
				System.out.println(texto);
				num = Integer.parseInt(br.readLine());
				error = false;
			} catch (IOException ex) {
				System.out.println("Error de entrada / salida.");
				error = true;
			} catch (NumberFormatException ex) {
				System.out.println("Debes introducir un n�mero entero.");
				error = true;
			}
		} while (error);
		return num;
	}
      
    
}
