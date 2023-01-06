import java.util.Scanner;

public class EjemploArreglosDesplazar4 {

    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento,pos,u;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Nuevo elemento");
        elemento = s.nextInt();

        System.out.println("Posición donde agregar (0 a 9 )");
        pos = s.nextInt();

        u = a[a.length-1];

        for (int i = a.length-2; i >= pos; i--) {
            a[i+1] = a[i];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        b[pos] = elemento;

        b[b.length-1] = u;

        System.out.println("Arreglo final");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Elemento " + (i+1) + " = " + b[i]);
        }

    }
}