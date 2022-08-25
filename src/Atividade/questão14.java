package Atividade;

import java.util.Scanner;

public class questão14 {
    public static void main(String[] args) {

        Scanner enterScanner = new Scanner(System.in);
        int x;
        double y;
        double consumo;
        x = enterScanner.nextInt();
        y = enterScanner.nextDouble();
        consumo = x/y;
       System.out.printf(String.format("%.3f", consumo) + " km/l ");




    }




}
