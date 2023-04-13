package exercicio_curso.estrutura_condicional;

import java.util.Scanner;

public class ex_04_if {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;
        
        System.out.println("Digite a hora inicial da gameplay e a final");
        horaInicial = scn.nextInt();
        horaFinal = scn.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " horas");

        scn.close();
    }
}
