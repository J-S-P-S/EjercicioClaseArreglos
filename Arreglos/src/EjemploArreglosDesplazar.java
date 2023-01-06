import java.util.Scanner;

public class EjemploArreglosDesplazar {

    public static void main(String[] args) {
        //Desplazar los elementos de 1 arreglo en 1 posición.

        int[] a = new int[10];
        int u;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese el número: ");
            a[i] = s.nextInt();
        }

        u = a[a.length-1];
        for (int i = a.length-2; i >= 0; i--) {
            a[i+1] = a[i];
        }
        a[0] = u;

        System.out.println("El arreglo final");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Elemento " + (i+1) + " = " + a[i]);
        }

    }
}