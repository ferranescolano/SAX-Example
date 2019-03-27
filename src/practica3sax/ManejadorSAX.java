
package practica3sax;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class ManejadorSAX extends DefaultHandler {
    
    List<String> listadoTags =new ArrayList<>();
    private String llistatArbrat;
    private Arbol arbol;
    private String atributos;
    List<Arbol> listadoArboles = new ArrayList<Arbol>();
    

    public int cantidadArboles;
   
       public List<Arbol> getArboles(){
            return listadoArboles;
       }
    
    public List<String> getTags(){
        return listadoTags;
    }

    @Override
    public void characters(char[] chars, int i, int i1) throws SAXException {
        super.characters(chars, i, i1);
        String caracter = new String(chars);
        String contenido  = caracter.substring(i , i + i1).trim();
        if (!contenido.isEmpty()){
            
        //Vamos a crear el objeto árbol añadiéndole todos los valores que reciba
         switch(atributos){
             
             case "codi":
                 arbol.setCodi(contenido);
                 break;
                 
             case "posicioX_ETRS89":
                 arbol.setPosicioX_ETRS89(contenido);
                 break;
                 
             case "posicioY_ETRS89":
                 arbol.setPosicioY_ETRS89(contenido);
                 break;
                 
             case "latitud_WGS84":
                    arbol.setLatitud_WGS84(contenido);
                    break;
             
             case "longitud_WGS84":
                    arbol.setLongitud_WGS84(contenido);
                    break;
                    
             case "tipusElement":
                 arbol.setTipusElement(contenido);
                 break;
                 
             case "espaiVerd":
                 arbol.setEspaiVerd(contenido);
                 break;
                 
             case "adreca":
                 arbol.setAdreca(contenido);
                 break; 
                
             case "alcada":
                 arbol.setAlcada(contenido);
                 break;
                 
             case "catEspecieId":
                 arbol.setCatEspecieId(contenido);
                 break;
                 
             case "nomCientific":
                 arbol.setNomCientific(contenido);
                 break;
                 
             case "nomEsp":
                 arbol.setNomEsp(contenido);
                 break;
                 
             case "nomCat":
                 arbol.setNomCat(contenido);
                 break;
                 
             case "categoriaArbrat":
                 arbol.setCategoriaArbrat(contenido);
                 break;
                 
             case "ampladaVorera":
                 arbol.setAmpladaVorera(contenido);
                 break;
                 
             case "plantacioDT":
                 arbol.setPlantacioDT(contenido);
                 break;
                 
             case "tipAigua":
                 arbol.setTipAigua(contenido);
                 break;
                 
             case "tipReg":
                 arbol.setTipReg(contenido);
                 break;
                 
             case "tipSuperf":
                 arbol.setTipSuperf(contenido);
                 break;
                 
             case "tipSuport":
                 arbol.setTipSuport(contenido);
                 break;
                 
             case "cobertaEscocell":
                 arbol.setCobertaEscocell(contenido);
                 break;
                 
             case "midaEscocell":
                 arbol.setMidaEscocell(contenido);
                 break;
                 
             case "voraEscocell":
                 arbol.setVoraEscocell(contenido);
                 break;
                       
               
             
         }
        }
         //Limpiamos Atributos
         atributos = "";
    
    }

    @Override
    public void startElement(String uri, String localName,  String qName, Attributes attributes) throws SAXException {
       
        atributos = qName;
        if(listadoTags.contains(qName)){
            
        }else{
            listadoTags.add(qName);
        }
        
        if(qName.equalsIgnoreCase("arbre")){
         cantidadArboles++;
            arbol = new Arbol();
        }
       // System.out.println("Cantidad de Arboles: " + cantidadArboles);
      //  super.startElement(string, string1, string2, atrbts); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void endDocument() throws SAXException {
        super.endDocument(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endElement(String string, String string1, String string2) throws SAXException {
        super.endElement(string, string1, string2);
   
        
        //En el siguiente if nos permite añadir el árbol completo a un 
        //ArrayList mediante el metodo arbolEntero(), en caso de que devuelva true
        if(string2.equals("arbre") && arbol.arbolEntero()){
            listadoArboles.add(arbol);
        }
        

    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument(); 
    }
    
    
    
    
}
