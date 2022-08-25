package Atividade;

import java.util.Scanner;

public class questão8 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);
        int NUMBER, horas;
        NUMBER = enterScanner.nextInt();
        horas = enterScanner.nextInt();
        double valorHora;
        valorHora = enterScanner.nextDouble();
        double SALARY;
        SALARY = (horas * valorHora);

        System.out.println("NUMBER=" + NUMBER);
        System.out.printf("SALARY = U$%.2f", horas * valorHora);




    }
}
