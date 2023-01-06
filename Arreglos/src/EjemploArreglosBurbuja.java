public class EjemploArreglosBurbuja {

    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB","Samsung Galaxy","Disco duro SSD Samsung externo",
                "Asus NoteBook","Macbook Air","Chromecast 4ta generación","Iphone 13 pro max"};

        int total = productos.length;
        int contador = 0;
        
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
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