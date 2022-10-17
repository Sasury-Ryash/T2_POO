package Questão_2;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		//Faça um programa que mostre o menu de opção a seguir, receba a opção do usuário e os dados necessários para executar cada operação.
		  Scanner sc = new Scanner(System.in);
			double num1, num2, soma, raiz, op;
					System.out.println("Menu");
					System.out.println("1- Somar dois números");
					System.out.println("2- Raiz quadrada de um número");
					System.out.println("Digite sua opção: ");
			       op = sc.nextDouble();
			        if (op == 1) {
						System.out.println("Digite um valor para o primeiro número: ");
						num1 = sc.nextInt();
						System.out.println("Digite um valor para o segundo número: ");
						num2 = sc.nextInt();
						soma = num1 + num2;
					System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
					}
					else if (op == 2) {
					System.out.println("Digite um valor: ");
					num1 = sc.nextInt();
					raiz = num1;
					raiz = Math.sqrt(raiz);
					System.out.println("Raiz quadrada de " + num1 + " é " + raiz);
					}
					else if ((op != 1) && (op !=2)) {
					System.out.println("Opção inválida! ");
						}
		}

	}