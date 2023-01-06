public class EjemploArreglosCombinados2 {

    public static void main(String[] args) {

        int[] a,b,c;
        a = new int[9];  //10 es múltiplo de 2 por eso se pueden ir agregando 2 elementos de a y b
        b = new int[9];  //Se puede cambiar el tamaño por ejemplo 9 para a y b y c debería ser 18 para almacenar de a 3 elementos
        int tamTotal = a.length + b.length;
        c = new int[tamTotal];
        int aux = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = (i+1) * 5;
        }
        //Copiar 2 elementos de a y 2 del arreglo b, para asignarlos en el arreglo c
        //i+=2 copiar 2 elementos, i+=3 copiar 3 elementos y los for j<2 k<2 o j<3 k<3 o en relación de la cantidad de elementos a copiar
        //tamTotal/2 es para la cantidad maxima de elementos a recorrer; Si se recorre un for 1 a 1 dejarlo solo tamTotal sin dividir

        for (int i = 0; i < tamTotal/2; i+=3) {
            for (int j = 0; j < 3; j++) {
                c[aux++] = a[i+j];
            }
            for (int k = 0; k < 3; k++) {
                c[aux++] = b[i+k];
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("Arreglo c, elemento " + (i+1) + " = " + c[i]);
        }

    }
}