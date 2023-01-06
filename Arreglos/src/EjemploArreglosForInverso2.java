import java.util.Arrays;

public class EjemploArreglosForInverso2 {

    public static void main(String[] args) {

        String[] productos = new String[7]; //Se reserva en memoria espacio para 7 elementos
        //Declaración = Instancia

        //Inicialización de elementos
        int total = productos.length;

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
        System.out.println("For normal"); //imprimir elementos de la Z-A

        for (int i = 0; i < total ; i++) {
            System.out.println("Elemento " + (i+1) + ": " + productos[i]);
        }

        System.out.println();
        System.out.println("For normal, inverso");

        // int total2 = productos.length;
        for (int i = 0; i < total/2; i++) { //Se divide en 2 así pueda llegar al punto de inflexión, al punto medio. Si no se divide en 2 o se busca ese punto medio, revierte los cambios porque lo hace 2 veces.
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
            //total2--;                     //Se puede decrementar y en vez de dividir por 2 se decrementa y se compara i<total2 solamente en esa condición el resto del bloque queda igual.
        }

        for (int i = 0; i < total ; i++) {
            System.out.println("Elemento " + (i+1) + ": " + productos[i]);
        }

    }
}