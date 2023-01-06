public class EjemploArreglosOrdenPF {

    public static void main(String[] args) {
        //EjemploArreglosOrdenPrincipioFinal solo que el nombre es bien largo para crear la clase con ese nombre

        int[] n,m;
        n = new int[10];
        m = new int[10];
        int tam = n.length, aux = 0;

        for (int i = 0; i < tam; i++) {
            n[i] = i + 1;
        }

        /*for (int i = 0; i < tam / 2; i++) {
            System.out.println("Principio " + n[i] + " Final " + n[tam - 1 - i]);
        }*/
        for (int i = 0; i < tam - i; i++) {
            m[aux++] = n[i];
            m[aux++] = n[tam - 1 - i];
        }

        for (int i = 0; i < m.length; i++) {
            System.out.println("Nuevo arreglo, elemento " + (i + 1) + " = " + m[i]);
        }
    }
}