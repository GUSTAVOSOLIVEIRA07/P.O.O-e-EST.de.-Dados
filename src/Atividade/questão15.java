package Atividade;

import java.util.Scanner;

public class questão15 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        x1 = enterScanner.nextDouble();
        y1 = enterScanner.nextDouble();
        x2 = enterScanner.nextDouble();
        y2 = enterScanner.nextDouble();
        double distx = (( x2 - x1) * ( x2 - x1));
        double disty = (( y2 - y1) * ( y2 - y1));
        double distancia = Math.sqrt(( distx + disty ));

        System.out.printf(" %.4f ", distancia);




    }
}
