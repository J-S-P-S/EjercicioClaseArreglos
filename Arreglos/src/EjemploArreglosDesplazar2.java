import java.util.Scanner;

public class EjemploArreglosDesplazar2 {

    public static void main(String[] args) {
        //Desplazar los elementos de 1 arreglo en 1 posición y además agregar un nuevo elemento
        // en una de las posiciones del arreglo.

        int[] a = new int[10];
        int elemento,pos;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length-1; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Nuevo elemento");
        elemento = s.nextInt();

        System.out.println("Posición donde agregar (0 a 9 )");
        pos = s.nextInt();

        for (int i = a.length-2; i >= pos; i--) {
            a[i+1] = a[i];
        }
        a[pos] = elemento;

        System.out.println("Arreglo final");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Elemento " + (i+1) + " = " + a[i]);
        }

    }
}