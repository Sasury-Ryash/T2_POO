package Questão_5;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
/*Faça um programa que leia um numero N que indica quantos valores inteiros e positivos devem ser lidos a seguir. 
 * para cada numero lido, mostre uma tabela contendo o valor lido e o fatorial desse valor.*/

		int n, num, fatNum, i, j;
		n = Integer.parseInt(JOptionPane.showInputDialog("Quantos números, positivos e inteiros, deseja ver e fatorar?"));
		for (i = 1; i <= n; i++ ){
		fatNum = 1;
		num = Integer.parseInt(JOptionPane.showInputDialog("Agora indique que número(s) deseja fatorar"));
		for (j = 1; j <= num; j++) {
			fatNum = fatNum * j;
	}
		System.out.println("O fatorial de "+ num + " = " + fatNum + ";");
	}
	}
	}
