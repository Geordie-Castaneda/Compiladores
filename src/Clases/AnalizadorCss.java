package Clases;

import java.util.ArrayList;

/**
 *
 * @author Geordie
 */

public class AnalizadorCss {
    ArrayList<String>lectura = new Lectura().leerFichero();
    private String[] selector = {"p", };
    
    public void lexico(){
        System.out.println("Lo que la variable lectura");
        System.out.println(lectura);
        for (int i = 0; i < lectura.size(); i++) {
            String linea1 = lectura.get(i);
            for (int j = 0; j < linea1.length(); j++) {
                if(linea1.charAt(i)== '{' && linea1.charAt(linea1.length()-1) == '}' ){
                    System.out.println("El primer caracter es " + linea1.charAt(i));
                    System.out.println("El ultimo caracter es: " +linea1.charAt(linea1.length()-1));
                    System.out.println(linea1);
                }
            }
        }
    
    
    
    
    
    
    
    
    
    }










}
