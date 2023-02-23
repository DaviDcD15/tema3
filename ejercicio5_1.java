/*
 5.1 Actividad propuesta.  Crea tres tablas de cinco elementos:la primera de enteros,secundo de double 
y tercero de booleanleano.Mostra las referencia en las que se encuentra cada una
de las tablas anteriores
 */
package javaapplication5_1actividadpropuestra;

/**
 *
 * @author JAVA
 */
public class JavaApplication5_1ActividadPropuestra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a [] =new int[5];
        double b[] = new double[5];
        boolean c[] = new boolean[5];
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        
        
    }
    
}



/*
  5.2 Actividad propuesta.  Contruye un tabla de 10 elementos del tipo que deseas
Declara diferentes variables de tabla que referenciaran la tabla creada.
Comprueba,imprimiendo por pantalla,que todas las variables contienen
la misma referencia
 */
package javaapplication5_2actividadpropuesta;

/**
 *
 * @author JAVA
 */
public class JavaApplication5_2ActividadPropuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[], b[], c[];
        a = new int[10];
        b = a;
        c = b;
        System.out.println(a + " " + b + " " + c);
    }

}






import java.util.Arrays;







/*
 * 5.1 Crea una tabla de longitud 10 que se inicializara con numeros aleatorios
comprendidos entre 1 y 100.Mostrar la suma de todos los numeros aleatorios
que se guardan en la tabla
 */
package javaapplication5.pkg1;

/**
 *
 * @author JAVA
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     int valores[];
     valores = new int [10];
     
     for (int i = 0; i < valores.length; i++) {
         valores[i] = (int) (Math.random() *100 + 1);
         
         int suma = 0;
         for(int valor: valores){
             suma += valor;
         }
         System.out.println(" La suma de los valores aleatorios es" + suma);
         
     }
    }
    
}




5.2  Diseniar un programa que solicite al usuario
que introduzca por teclado 5 numeros
decimales. A continuacion,mostrar los numeros en
el mismo orden que se han introducido






5.3 Escribir una aplicacion que solicite al ususrio cuantos numeros desea introducir
A cuntinuacion,introducir por teclado esa cantidad de numeros enteros,y por ultimo
mostrar en el orden inverso al introducido

