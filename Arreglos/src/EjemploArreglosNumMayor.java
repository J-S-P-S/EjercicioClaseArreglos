import java.util.Scanner;

public class EjemploArreglosNumMayor {

    public static void main(String[] args) {

        int[] a = new int[5];
        int tam = a.length, max = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese 5 números enteros: ");
        for (int i = 0; i < tam ; i++) {
            a[i] = leer.nextInt();
        }

        for (int j = 1; j < tam; j++) {
            max = (a[max]>a[j])?max:j;
        }

        System.out.println("El número mayor es = " + a[max]);

    }
}