package exercicio_curso.estrutura_repetitivas;

import java.util.Scanner;

public class exemplo_while {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        int soma = 0;
        while (x != 0) {
            soma += x;
            x = scn.nextInt();
        }

        System.out.println(soma);

        scn.close();
    }
}
