import java.util.Scanner;

public class Ejemplo_Comandas {
    /**Crear un programa que permita a traves de un menu (tortilla, Croquetas jamon)
     * Indicar lo que el cliente solicita y mostrar el total de su pedido tomando en cuenta
     * Tortilla 2€
     * Croquetas 8€
     * Jamon y Queso 15€
     * Bebida 3€
     *
     */


    public static void main(String[] args) {
        //declaracion de Variables
        Scanner sn=new Scanner(System.in);
        int cuenta=0;
        String detallePedido="\t bebidas\n";
        Byte opcion=0;
        /*Crear un bucle eocn en menu */
       do {
           System.out.println(".....Menú coffe House....");
           System.out.println("\t1. Tortillas");
           System.out.println("\t2 Croquetas");
           System.out.println("\t3 Jamon y queso");
           System.out.println(" \t4 Bebidas");
           System.out.println(" \t5 Salir ");
           System.out.println(" \tIndique su opcion");
           opcion = sn.nextByte();
           switch (opcion) {

               case 1 -> {
                   cuenta += 2;
                   detallePedido = "\t tortillas\n";

               }

               case 2 -> {

                   cuenta +=8*cantidad;
                   detallePedido = "\tcroquetas\n";
               }
               case 3 -> {
                   cuenta += 15*cantidad;
                   detallePedido = "\tjamon y queso\n";
               }
               case 4 -> {
                   cuenta +=3*cantidad ;
                   detallePedido = "\tBebida\n";

               }
               case 5 -> System.out.println(".....generando su cuenta.....");
               default -> {
                   System.out.println("opcion no valida");
               }
           }
       }       while(opcion!=5);
               double iva=cuenta*0.21;
        System.out.println("\n\n.....Factura simplificada.....");
        System.out.println("\tpedido:  \n" + detallePedido);
        System.out.println("\tTotal sin IVA: " + cuenta + "€");
        System.out.println("\tIVA:");
        System.out.println("15.2f" iva);
        System.out.println("\n\tImporte total (con IVA):" + total + "€");
        System.out.println(".........................................");



    }
}
