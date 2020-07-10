import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class AproximacionNumeroE {

    //Solicita un número entero positivo n. Y calcula el valor aproximado del numero e mediante n sumas.
    // 1 + (1 / 1!) + ( 1 / 2!) + (1 / 3!) + ..+ (1 / n!)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº: ");
        double num = sc.nextInt();
        double sumatorio = 1;
        System.out.println("Número introducido: " + num);
        //Hallar el factorial del nº
        for(int i = 1; i<=num; i++){
            double factorial = 1;
            for(int j = 1; j<=i; j++) {
                factorial = factorial * j;
            }
            sumatorio = sumatorio + 1 / factorial;
        }
        System.out.println("Resultado: " + sumatorio);
    }
}
