package Questão_6;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		 System.out.println("Descubra se o número é primo: ");
		 Scanner x = new Scanner(System.in);
		 System.out.println("Digite um número: ");
		 int num = x.nextInt();
		 if((num/num==1)&&(num/1==num)){
			 System.out.println("O número " + num + " é primo");
		 }
		 else {
			 System.out.println("O número " + num + "não é primo!");
		 }
			
		}

	}

