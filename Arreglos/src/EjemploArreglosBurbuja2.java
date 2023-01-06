public class EjemploArreglosBurbuja2 {

    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB","Samsung Galaxy","Disco duro SSD Samsung externo",
                "Asus NoteBook","Macbook Air","Chromecast 4ta generación","Iphone 13 pro max"};

        int total = productos.length;
        int contador = 0;
        
        for (int i = 0; i < total-1; i++) {
            for (int j = 0; j < total-1-i; j++) {
                if (productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++; //para contar cuantas veces realiza el proceso
            }
        }

        for (int i = 0; i < total ; i++) {
            System.out.println("Elemento " + (i+1) + ": " + productos[i]);
        }
        System.out.println();
        System.out.println("Contador = " + contador);
        
    }
}