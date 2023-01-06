import java.util.Arrays;

public class EjemploArreglosForInverso {

    public static void main(String[] args) {

        String[] productos = new String[7]; //Se reserva en memoria espacio para 7 elementos
        //Declaración = Instancia

        //Inicialización de elementos
        int count = productos.length;

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
        System.out.println("For normal,  mostrar inverso del arreglo"); //imprimir elementos de la Z-A

        for (int i = 0; i < count; i++) {
            System.out.println("Elemento " + (count-1-i) + ": " + productos[count-1-i]);
        }

        System.out.println("For normal, inverso 2");
        for (int i = count-1; i >= 0; i--) {
            System.out.println("Elemento " + i + ": " + productos[i]);
        }

    }
}