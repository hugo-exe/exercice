package exercicio_curso;

import java.util.Scanner;

public class ex_01 {

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, soma;

		System.out.println("Digite um número a ser somado: ");
		num1 = scn.nextInt();
		System.out.println("Digite outro número a ser somado: ");
		num2 = scn.nextInt();

		soma = num1 + num2;

		System.out.println("A soma dos dois número é: " + soma);

// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos
		
		System.out.println("Exercício 2");
		System.out.println("Escreva o número a ser calculado o raio: ");
		
		double R, A, pi = 3.14159;

		R = scn.nextDouble();
		A = pi * R * R;
		
		System.out.printf("A=%.4f%n", A);
		
		
		System.out.println("Exercício 3");
		System.out.println("Escreva os números a serem calculados a diferença: ");
		
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto	de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		int A1, B, C, D, dif;
		
		A1 = scn.nextInt();
		B = scn.nextInt();
		C = scn.nextInt();
		D = scn.nextInt();
		
		dif = A1 * B - C * D;
		
		System.out.println("A diferença é: " + dif);

		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casasdecimais.
		
		System.out.println("Exercício 4");
		System.out.println("Escreva o número de um funcionário, número de horas trabalhas, valor por hora trabalhada: ");
		
		int f, ht;
		double vht, vt;
		
		f = scn.nextInt();
		System.out.println("Escreva suas horas trabalhas: ");
		ht = scn.nextInt();
		System.out.println("Escreva o valor por hora: ");
		vht = scn.nextInt();
		
		System.out.println("O resultado é");
		
		vt = ht * vht;
		
		System.out.println("Número do funcionário: " + f);
		System.out.printf("Salário total do funcionário = R$ %.2f%n", vt);
		
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		System.out.println("Exercício 5");
		
		int p1, np1, p2, np2;
		double vp1, vp2, vpt;
		
		System.out.println("Digite o código da peça 1: ");
		p1 = scn.nextInt();
		System.out.println("Digite a quantidade de peças 1: ");
		np1 = scn.nextInt();
		System.out.println("Digite o valor unitário da peça 1: ");
		vp1 = scn.nextDouble();
		
		System.out.println("Digite o código da peça 2: ");
		p2 = scn.nextInt();
		System.out.println("Digite a quantidade de peças 2: ");
		np2 = scn.nextInt();
		System.out.println("Digite o valor unitário da peça 2: ");
		vp2 = scn.nextDouble();
		
		vpt = vp1 * np1 + vp2 * np2;
		
		System.out.printf("Valor total a ser pago: R$%.2f%n", vpt);
		
//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		
		System.out.println("Exercício 6");
		System.out.println("Digite os valores do triangulo, circulo, trapezio, quadrado, retangulo");
		
		double A6, B6, C6, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A6 = scn.nextDouble();
		B6 = scn.nextDouble();
		C6 = scn.nextDouble();
		
		triangulo = A6 * C / 2.0;
		circulo = 3.14159 * C6 * C6;
		trapezio = (A6 + B6) / 2.0 * C6;
		quadrado = B6 * B6;
		retangulo = A6 * B6;
		
		System.out.printf("Triangulo: %.3f%n", triangulo);
		System.out.printf("Circulo : %.3f%n", circulo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);
		
	}
}
