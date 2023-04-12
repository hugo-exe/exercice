package exercicio_curso.extrutura_condicional;

import java.util.Scanner;

public interface ex_03_if {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int A;
        int B;

        System.out.println("Digite o valor de A");
        System.out.println("Digite o valor de B");
        A = scn.nextInt();
        B = scn.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        scn.close();
    }
}
