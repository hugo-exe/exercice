package exercicio_curso.estrutura_condicional;

import java.util.Scanner;

public class ex_02_if {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num;

        System.out.println("Digite um número");
        num = scn.nextInt();

        if (num % 2 == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é impar");
        }
        
        scn.close();
    }
}
