package Atividade;

import java.util.Scanner;

public class questão11 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);
        double VOLUME, pi, raio;
        pi = 3.14159;

        raio = enterScanner.nextDouble();
        VOLUME = (4/3.0) * pi * raio * raio * raio;

        System.out.printf("VOLUME = %.3f", VOLUME);



    }
}
