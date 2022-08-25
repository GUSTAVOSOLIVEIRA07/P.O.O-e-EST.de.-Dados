package Atividade;

import java.util.Scanner;

public class questão2 {
    public static void main(String[] args) {

        Scanner enterScanner = new Scanner(System.in);
        double area, n, raio;
        n = 3.14159;

        raio = enterScanner.nextDouble();
        area = n * raio * raio;

        System.out.printf("A=%.4f", area);

    }

}
