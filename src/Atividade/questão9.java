package Atividade;

import java.util.Scanner;

public class questão9 {

    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);
        String nome;
        double SalarioFixo, TotalVendas;
        System.out.print("nome: ");

        nome = enterScanner.next();
        SalarioFixo = enterScanner.nextDouble();
        TotalVendas = enterScanner.nextDouble();
        double TOTAL;

        TOTAL = (SalarioFixo+ TotalVendas* 0.15);

        System.out.printf("TOTAL = %.2f", TOTAL);







    }
}
