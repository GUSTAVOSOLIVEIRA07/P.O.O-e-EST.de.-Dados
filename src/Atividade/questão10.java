package Atividade;

import java.io.PrintStream;
import java.util.Scanner;

public class questão10 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);

        int Pecas1, NumPecas1, Pecas2, NumPecas2;
        Pecas1 = enterScanner.nextInt();
        Pecas2 = enterScanner.nextInt();
        NumPecas1 = enterScanner.nextInt();
        NumPecas2 = enterScanner.nextInt();

        double PrecoPecas1, PrecoPecas2;
        PrecoPecas1 = enterScanner.nextDouble();
        PrecoPecas2 = enterScanner.nextDouble();

        double VALORAPAGAR;
        VALORAPAGAR = ((NumPecas1*PrecoPecas1) + (NumPecas2*PrecoPecas2 ));

        System.out.printf("VALOR A PAGAR = R$%.2f", VALORAPAGAR);


    }
}
