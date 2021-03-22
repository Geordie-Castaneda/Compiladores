package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Geordie
 */
public class Lectura {
    private ArrayList<String> linea = new ArrayList<String>();
    
    public ArrayList<String> leerFichero(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            archivo= new File("C:\\Users\\Geordie\\Desktop\\Jordy\\Compiladores\\Analizador Lexico\\src\\Clases\\Css.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String lineas;    
            while((lineas=br.readLine())!=null){
                System.out.println(lineas);
                linea.add(lineas);
            }

        }
        catch(Exception e){
            System.out.println("Error de tipo: "+e);
        }
        finally{
            try{
                if ( null != fr ){
                    fr.close();
                }
            }
            catch(Exception i){
                System.out.println("Exception tipo: "+i);
            }
            
        
        }
        return linea;
    }

    public ArrayList<String> getLinea() {
        return linea;
    }

    public void setLinea( ArrayList<String> linea) {
        this.linea = linea;
    }
    
    
    

    
}
