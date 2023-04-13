package exercicio_curso.estrutura_repetitivas;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int s = scn.nextInt();

        while (s != 2002) {
            System.out.println("Senha inválida");
            s = scn.nextInt();
        }
        
        System.out.println("Senha válida");
        scn.close();
    }
    
}
