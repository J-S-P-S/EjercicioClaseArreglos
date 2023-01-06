import java.util.Arrays;

public class EjemploArreglos2 {

    public static void main(String[] args) {

        String[] productos = new String[7]; //Se reserva en memoria espacio para 7 elementos
        //Declaración = Instancia

        //Inicialización de elementos
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Iphone 13 pro max";

        //La clase arrays y el método helper sort para ordenar de forma ascendente.
        Arrays.sort(productos); //Clase que importa de java.util Sirve para orden los elementos de la A-Z o cualquier tipo de dato de forma ascendente.

        String i1 = productos[0];
        String i2 = productos[1];
        String i3 = productos[2];
        String i4 = productos[3];
        String i5 = productos[4];
        String i6 = productos[5];
        String i7 = productos[6];

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
        System.out.println("i5 = " + i5);
        System.out.println("i6 = " + i6);
        System.out.println("i7 = " + i7);

    }

}