package Atividade;

import java.util.Scanner;

public class questão13 {
    public static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);
        int A , B, C, AB, ABC;
        A = enterScanner.nextInt();
        B = enterScanner.nextInt();
        C = enterScanner.nextInt();
        AB =((A + B) + Math.abs(A - B))/2;
        ABC =((AB + C) + Math.abs(AB - C))/2;

        System.out.println(ABC + " eh o maior");

    }
}
