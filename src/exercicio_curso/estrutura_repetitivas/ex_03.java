package exercicio_curso.estrutura_repetitivas;

import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        int tipo = scn.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                gasolina = gasolina + 1;
            }
            else if (tipo ==2) {
                alcool = alcool + 1;
            }
            else if (tipo ==3) {
                diesel = diesel + 1;
            }

            tipo = scn.nextInt();
        }
        System.out.println("Obrigado pela escolha!");
        System.out.println("Gasolina " + gasolina);
        System.out.println("Alcool " + alcool);
        System.out.println("Diesel " + diesel);

        scn.close();
    }
}
