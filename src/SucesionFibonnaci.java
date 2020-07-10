import java.util.Scanner;

public class SucesionFibonnaci {

    //Solicita un número entero mayor que 2 (n).
    //Y muestra por pantalla los n primeros elementos de la sucesión de Fibbonacci.1,1,2,3,5,8,13,21,34,55,89, ...
    public static void main(String[] args) {
        System.out.println("Introduce un nº mayor que 2 y te daremos ese número de número de Fibonnaci: ");
        Scanner sc = new Scanner(System.in);
        int variable1 = 1;
        int variable2 = 1;
        int variable3 = 0;

        int num = sc.nextInt();
        System.out.print(variable1 + " " + variable2 + " ");
        for(int i = 2; i<num; i++){
            variable3 = variable1;
            variable1 = variable1 + variable2;
            System.out.print(variable1 + " ");
            variable2 = variable3;
        }

    }


}
