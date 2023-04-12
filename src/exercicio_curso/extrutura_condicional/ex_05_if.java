package exercicio_curso.extrutura_condicional;

import java.util.Scanner;

public class ex_05_if {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int cod = scr.nextInt();
        int quant = scr.nextInt();

        double total;

        if (cod == 1) {
            total = quant * 4.0;
        } else if (cod == 2) {
            total = quant * 4.5;
        } else if (cod == 3) {
            total = quant * 5.0;
        } else if (cod == 4) {
            total = quant * 2.0;
        } else {
            total = quant * 1.5;
        }

        System.out.printf("total: R$ %.2f%n", total);
    }
}
