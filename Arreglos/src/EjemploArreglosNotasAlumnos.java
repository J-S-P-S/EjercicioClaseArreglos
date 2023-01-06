import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {

    public static void main(String[] args) {

        double[] cMat, cHis, cLen;
        cMat = new double[7];
        cHis = new double[7];
        cLen = new double[7];
        double sumMat = 0.0, sumHist = 0.0, sumLen = 0.0, pAlumno = 0.0;
        int id = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Notas de la clase matemáticas. \nIngrese 7 notas.");

        for (int i = 0; i < 7; i++) {
            cMat[i] = leer.nextDouble();
        }
        System.out.println("Notas de la clase historia. \nIngrese 7 notas.");
        for (int i = 0; i < 7; i++) {
            cHis[i] = leer.nextDouble();
        }
        System.out.println("Notas de la clase lenguaje. \nIngrese 7 notas.");
        for (int i = 0; i < 7; i++) {
            cLen[i] = leer.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumMat += cMat[i];
            sumHist += cHis[i];
            sumLen += cLen[i];
        }

        sumMat = sumMat/cMat.length;
        sumHist = sumHist/cHis.length;
        sumLen = sumLen/cLen.length;

        System.out.println("Promedio clase matemáticas = " + sumMat);
        System.out.println("Promedio clase historia = " + sumHist);
        System.out.println("Promedio clase lenguaje = " + sumLen);
        System.out.println("Promedio general del curso = " + ((sumMat+sumHist+sumLen)/3));

        System.out.println("Ingrese id del alumno (0-6): ");
        id = leer.nextInt();
        pAlumno = (cMat[id] + cHis[id] + cLen[id])/3;
        System.out.println("Promedio del alumno " + id + " es: " + pAlumno);

    }
}