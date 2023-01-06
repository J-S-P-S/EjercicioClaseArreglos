import java.util.Scanner;

public class EjemploArreglosEliminar {

    public static void main(String[] args) {
        //Eliminar 1 elemento del arreglo

        int[] a = new int[10];
        int pos = 0;

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = leer.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese una posición a eliminar entre 0-9");
        pos = leer.nextInt();

        for (int i = pos; i < a.length-1; i++) {
            a[i] = a[i+1];
        }

        /*for (int i = 0; i < a.length; i++) {
            System.out.println("Elemento " + (i) + " = " + a[i]);
        }*/

        int[] b = new int [a.length-1];
        System.arraycopy(a,0,b,0,b.length);
        System.out.println("Nuevo arreglo");

        for (int i = 0; i < b.length; i++) {
            System.out.println("Elemento " + (i) + " = " + b[i]);
        }

    }
}