/*
 Un centro de investigacion de la flora urbana necesita
una aplicacion que muestre cual es el arbol mas alto
Para ello se introducira por teclado la altura (en centimetros)
de cada arbol (terminando la introduccion de datos cuando se utilice
-1 como altura) Los arboles se identifican mediante etiquetas
con numeros unicos correlativos,comenzando en 0.
Diseñar una aplicacion que resuelva el problema planteado
 */
package javaapplication.actividadresuelta3_4contema4;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author cafet
 */
public class JavaApplicationActividadResuelta3_4ConTema4 {

    private static double diferentes(double arbolMasGrande, double arbolPequeño) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US); 
      
      System.out.print("Introduzca arbolMasGrande  ");
      double arbolMasGrande = sc.nextDouble();
      System.out.print("Introduzca arbolPequeño  ");
      int arbolPequeño = sc.nextInt();

      double res = diferentes(arbolMasGrande, arbolPequeño);
      System.out.println(arbolMasGrande + " diferentes " + arbolPequeño + " = " + res);
   }
    
}

  public class Main {

   static double diferentes(double a, int n) {
      double res = 1; 

      for (int i = 1; i <= n; i++) {
         res = res * a; 
      }

      return (res);
   }
}
