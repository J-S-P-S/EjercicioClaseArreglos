public class EjemploArreglosBurbujaInt {

    public static void sortBurbuja(Object[] arreglo, int tam){

        for (int i = 0; i < tam-1; i++) {
            for (int j = 0; j < tam-1-i; j++) {
                if ( ((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0 ){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
    }

    public static void imprimir(Object[] arreglo,int tam){
        for (int i = 0; i < tam ; i++) {
            System.out.println("Elemento " + (i+1) + ": " + arreglo[i]);
        }
    }

    public static void main(String[] args) {

        Integer[] n = {10,Integer.parseInt("7"),35,1};
        int total = n.length;
        sortBurbuja(n,total);   //organizar(Arreglo,tamaño del arreglo)
        imprimir(n,total);      //imprimir(Arreglo,tamaño del arreglo)

    }
}