package Main;

import java.io. * ;
import java.util.Scanner;

public class ScannerCSV {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(new File("Tarea1Datos1\\Hoja de cálculo sin título - Hoja 1.csv"));
        lector.useDelimiter(",");
        while (lector.hasNext()) {
            System.out.print(lector.next()+ " ");
        }
        lector.close();
    }
}