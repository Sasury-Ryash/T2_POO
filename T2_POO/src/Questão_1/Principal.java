package Questão_1;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {

		   int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro e descubra se ele é par ou ímpar!"));
			float r = n%2;
			if(r == 0) {
			System.out.println("Seu número é par!");
			}
		      else {
		    System.out.println("Seu número é ímpar!");
							}
					}
	}

