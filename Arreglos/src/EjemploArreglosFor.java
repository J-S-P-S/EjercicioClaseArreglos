import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

        String[] productos = new String[7]; //Se reserva en memoria espacio para 7 elementos
        //Declaración = Instancia

        //Inicialización de elementos
        int count = productos.length;
        int iter = 0;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Iphone 13 pro max";

        //La clase arrays y el método helper sort para ordenar de forma ascendente.
        Arrays.sort(productos); //Clase que importa de java.util Sirve para orden los elementos de la A-Z o cualquier tipo de dato de forma ascendente.
        System.out.println();
        System.out.println("For normal");

        for (int i = 0; i < count ; i++) {
            System.out.println("Elemento " + (i+1) + ": " + productos[i]);
        }
        System.out.println();
        System.out.println("For each");
        for(String prod:productos){
            iter++;
            System.out.println("Producto "+ iter+ " = " + prod);
        }

        System.out.println();
        System.out.println("Usando while");
        iter = 0;
        while (iter<count){
            System.out.println("Producto "+ iter+ " = " + productos[iter]);
            iter++;
        }
        //Es mejor práctica utilizar el for que el while, for es mas optimizado y sirve para iterar entre límites
        System.out.println();
        System.out.println("Usando do while");
        iter = 0;
        do {
            System.out.println("Producto "+ iter+ " = " + productos[iter]);
            iter++;
        }while (iter<count);

        System.out.println();
        System.out.println("Arreglo tipo entero con for normal");

        int[] n = new int[10];
        int nl = n.length;

        for (int i = 0; i < nl; i++) {
            n[i] = i*3;
        }

        for (int i = 0; i < nl; i++) {
            System.out.println("Números = " + n[i]);
        }

    }
}