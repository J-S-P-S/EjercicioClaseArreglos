import java.util.Scanner;

public class EjemploArreglosParesImpares {

    public static void main(String[] args) {
        int[] a, pares, impares;
        int c = 0, c1 = 0, aux = 0, aux2 = 0;
        a = new int[10];

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 10 números");

        for (int i = 0; i < 10; i++) {
            a[i] = leer.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                c++;
            } else {
                c1++;
            }
        }

        pares = new int[c];
        impares = new int[c1];

        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                pares[aux++] = a[i];
            } else {
                impares[aux2++] = a[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print("Elemento " + (i + 1) + " = " + pares[i] + " ");
        }
        System.out.println("\nIngreso "+ c + " números pares.");
        System.out.println();
        System.out.println("Impares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print("Elemento " + (i + 1) + " = " + impares[i] + " ");
        }
        System.out.println("\nIngreso "+ c1 + " números impares.");

    }
}