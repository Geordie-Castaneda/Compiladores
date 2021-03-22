package Clases;

/**
 *
 * @author Geordie
 */
public class Main {

    public static void main(String args[]){
    
        Lectura lectura = new Lectura();
        AnalizadorCss acss = new AnalizadorCss();
        System.out.println("Lectura del archivo");
        lectura.leerFichero();
        System.out.println("--------------");
        acss.lexico();
        
    
    }
    
}
