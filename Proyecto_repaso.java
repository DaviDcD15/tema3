import java.util.Scanner;

public class Proyecto_repaso{

    public static void main(String[] args) {




        //tipos da datos-> las declaracioneas tienen que estar llamados con su tipo de dato. Ej int total;
        int total=0;//se puede iniciaalizar 3en momento de declaracion o luego adentro de ejecución del programa
        String nombreUsuario;
        String provincia;
        //Luego tenemos la declaraciones de la clase Scanner leer la informacionque solicitamos, siempre
        //relacionado con el tipo de dato que se va a escribir
        //Declaración
        Scanner sn=new Scanner(System.in);
        int habitantes;






//Bucles
//utilizamosun bucle desde hasta 1 hasta 5 y lee los datos
for (int i=1;i<=5;i++) {
    System.out.println("indica tu nombre->");
    nombreUsuario=sn.nextLine();
    System.out.println("indica la provincia->");
    provincia=sn.nextLine();
    System.out.println("indica el numero de  habitantes -> ");
    habitantes=sn.nextInt();
    //Condicionales -> si el número de habitantes es menor de 20000 indicar que hay error
            //para que vuelva a solicitar la información/*/

if (habitantes<20000) {
    i--;
    System.out.println(nombreUsuario + "los habitantes de " + "son mas de " + habitantes + "-");

}else{
    total+=habitantes;

}
}
      }

}