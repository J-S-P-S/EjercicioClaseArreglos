public class EjemploArreglos {

    public static void main(String[] args) {

        int[] n = new int[4]; //Se reserva en memoria espacio para 4 elementos
        //Declaración = Instancia

        //Inicialización de elementos
        n[0] = 10;
        n[1] = Integer.parseInt("20"); //también se pueden hacer conversiones o hacer cast desde que se almacene un valor del tipo de datos del arreglo.
        n[2] = 30;
        n[3] = 40;

        int i1 = n[0];
        int i2 = n[1];
        int i3 = n[2];
        int i4 = n[3];

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);


    }

}