package exercicio_curso.extrutura_condicional;

import java.util.Scanner;

public class ex_01_if {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = scn.nextInt();

        if (num < 0) {
            System.out.println("Esse é um número negativo");
        } else {
            System.out.println("Esse é um número positivo");
        }

        scn.close();
    }
}
