import java.util.Scanner;

public class EjemploArreglosDesplazar3 {

    public static void main(String[] args) {
        //Desplazar los elementos 1 posición y agregar 1 elemento nuevo pero manteniendo el arreglo ordenado

        int[] a = new int[7];
        int elemento,pos;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length-1; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese un número a insertar: ");
        elemento = s.nextInt();
        pos = 0;

        while (pos < 6 && elemento > a[pos]){
            pos++;
        }

        for (int i = a.length-2; i >= pos; i--) {
            a[i+1] = a[i];
        }

        a[pos] = elemento;
        System.out.println("Arreglo ordenado");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Elemento " + (i+1) + " = " + a[i]);
        }

    }
}