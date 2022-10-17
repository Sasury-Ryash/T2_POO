package Questão_8;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
				int op, sal, imp, aum, novoS;
				System.out.println("MENU DE OPÇÕES");
				System.out.println("1 - Imposto");
				System.out.println("2 - Novo Salário");
				System.out.println("3 - Classificação");
				System.out.println("4 - Finalizar o programa");
				System.out.println("Digite a opção desejada: ");
				Scanner sc = new Scanner(System.in);
				op = sc.nextInt();
				 if (op > 4 || op < 1) {
						System.out.println(" Opção inválida! ");
						}
				 if (op == 1) {
		        Scanner sc1 = new Scanner(System.in);
					 System.out.println("Digite seu salário: ");
					 sal = sc1.nextInt();
					 if (sal < 500) {
						 System.out.println("O valor dos impostos é: ");
						imp = sal * 5/100;
						System.out.println(imp);
						}
					if (sal >= 500 && sal <= 850) {
						System.out.println("O valor dos impostos é: ");
						imp = sal * 10/100;
					System.out.println(imp);
					}
			    if (sal > 850) {
			    	System.out.println("O valor dos impostos é: ");
			    	imp = sal * 15/100;
			    	System.out.println(imp);
			    }
			         }
				 if (op == 2) {
					 Scanner sc2 = new Scanner(System.in);
					 System.out.println("Qual o seu salário? ");
					 sal = sc2.nextInt();
					 if(sal > 1500) {
						 aum = 25;
						 System.out.println("Seu Novo Salário é: ");
						 novoS =  sal + aum;
						 System.out.println(novoS);
					 }
					 if (sal >= 750 && sal <= 1500) {
						 aum = 50;
						 System.out.println("Seu Novo Salário é: ");
						 novoS =  sal + aum;
						 System.out.println(novoS);
					 }
					 if (sal >= 450 && sal < 750) {
						 aum = 75;
						 System.out.println("Seu Novo Salário é: ");
						 novoS = sal + aum;
						 System.out.println(novoS);
					 }
					 if(sal > 450) {
						 aum = 100;
						 System.out.println("Seu novo salário é: ");
						 novoS =  sal + aum;
						 System.out.print(novoS);
					 }
					 
				 }
				 if (op == 3) {
					 Scanner sc3 = new Scanner(System.in);
					 System.out.println("Qual o seu salário?");
					 sal = sc3.nextInt();
					 if(sal <= 700) {
						 System.out.println("Mal Remunerado");
					 }
					 else if (sal > 700) {
						 System.out.println("Bem Remunerado");
					 }
					 }
						if (op == 4) {
							System.out.println("Obrigado(a) pelo(a) confiança!");
				 }
			}
	}

