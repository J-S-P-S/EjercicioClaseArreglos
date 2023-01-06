import java.util.Scanner;

public class EjemploArregloDetectarOrden {

    public static void main(String[] args) {
        int[] a = new int[7];
        int tam;
        tam = a.length;
        boolean asc = false, des = false;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese 7 números");
        for (int i = 0; i < tam; i++) {
            a[i] = leer.nextInt();
        }

        for (int j = 0; j < tam - 1; j++) {
            if (a[j] > a[j + 1]) {
                des = true;
            } else if (a[j] < a [j+1]){
                asc = true;
            }
        }

        if(asc == true && des == true){
            System.out.println("Arreglo, se encuentra desordenado");
        }

        if(asc == false && des == false){
            System.out.println("Todos los elementos del arreglo son iguales");
        }

        if(asc == true && des == false){
            System.out.println("Arreglo ordenado de forma ascendente");
        }

        if(asc == false && des == true){
            System.out.println("Arreglo ordenado de forma descendente");
        }

    }

}