package exercicio_curso.extrutura_condicional;

import java.util.Scanner;

public class exemplo_if {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int hora;

        System.out.println("Que horas é agora?");
        hora = scn.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        scn.close();
    }
}
