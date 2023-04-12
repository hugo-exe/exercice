package exercicio_curso.extrutura_condicional;

import java.util.Scanner;

public class ex_06_if {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double intervalo = scn.nextDouble();
        
        if (intervalo < 0.0 || intervalo > 100.0) {
            System.out.println("Fora do intervalo");
        } else if (intervalo <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (intervalo <= 50.0) {
            System.out.println("Intervalo [25,50]");
        } else if (intervalo <= 75.0) {
            System.out.println("Intervalo [50,75]");
        }
        else {
            System.out.println("Intervalo (75,100)");
        }

        scn.close();
    }
}
