import java.util.Scanner;

public class ArrayBuscador {

    //array de cadenas, pregunta al usuario una palabra y busca si existe en la array. Marca posición.
    public static void main(String[] args) {

        String[] arrayString = new String[] {"Hola" , "Adiós", "Mundo", "Java", "Matlock", "Desde"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra para ver si está en el sistema: ");
        String word = sc.nextLine();
        boolean marcador = false;
        int index = -1;

        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equalsIgnoreCase(word)){
                index = i;
                marcador = true;
                break;
            }
        }
        if (marcador){
            System.out.println("Se ha encontrado la palabra \"" + word + "\" en la posición: " + index);
        }else{
            System.out.println("La palabra \"" + word + "\" no se encuentra en el sistema");
        }
        //Hazlo con un while
        int contador = 0;
        while (contador < arrayString.length){
            if(arrayString[contador].equalsIgnoreCase(word)){
                //index = i;
                //marcador = true;
            }
            contador++;
        }
    }
}
