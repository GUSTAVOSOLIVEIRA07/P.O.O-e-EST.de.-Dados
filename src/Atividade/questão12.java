package Atividade;

import java.util.Scanner;

public class questão12 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);
        double A, B, C, pi;
        A = enterScanner.nextDouble();
        B = enterScanner.nextDouble();
        C = enterScanner.nextDouble();
        pi = 3.14159;

        double TRIANGULO;
        double CIRCULO;
        double TRAPEZIO;
        double QUADRADO;
        double RETANGULO;
        TRIANGULO = (A * C)/2;
        CIRCULO = (pi * (C * C));
        TRAPEZIO = ((A + B) * C)/2;
        QUADRADO = (B * B);
        RETANGULO = (A * B);

        System.out.printf(" TRIANGULO: %.3f", TRIANGULO);
        System.out.printf(" CIRCULO: %.3f", CIRCULO);
        System.out.printf(" TRAPEZIO: %.3f", TRAPEZIO);
        System.out.printf(" QUADRADO: %.3f", QUADRADO);
        System.out.printf(" RETANGULO: %.3f", RETANGULO);





    }
}
