package exercicio_curso.estrutura_condicional;

import java.util.Scanner;

public class exemplo_debug {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double largura = scn.nextDouble();
        double comprimento = scn.nextDouble();
        double metroQuadrado = scn.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Area = %.2f%n", preco);
        
        scn.close();
    }
}
