package Questão_9;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
				double soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, mediaPar=0, númerosI = 0, porcentagem = 0;  
				double []nums;
				int tmnR;
				Scanner sc = new Scanner(System.in);
				System.out.print("Quantos números deseja digitar? ");
				String tmn = sc.next();
				tmnR = Integer.parseInt(tmn);
				nums = new double[tmnR];
						
						for (int i = 0; i < tmnR; i++) {
							System.out.print("Digite o "+ (i+1) + "º número :");
							nums[i] = sc.nextDouble();
							soma += nums[i];
						}
						
						double media = (soma/tmnR);
						
						for( int i = 1; i<= nums.length-1;i++){
					           
						       if(nums[i]>maior){
				               maior = (int)nums[i];
				            }
				            
				            if(nums[i]<menor){
				               menor=(int)nums[i]; 
				            }

						}
						
						for (int i = 0; i <= nums.length-1; i++) {
							 if(nums[i] % 2 == 0){
								 mediaPar= mediaPar+1; 	 
							 }
							 else {
							númerosI = númerosI+1;
							porcentagem = númerosI/tmnR*100F;
							 }
						}
						System.out.println("A soma dos valores é: "  + soma);
						System.out.println("A quantidade de números digitados é: "  + tmn);
						System.out.println("A média dos números é: " + media);
						System.out.println("Maior número digitado é: "  + maior);
						System.out.println("Menor número digitado é: "  + menor);
						System.out.println("A média dos números pares é: "  + mediaPar/tmnR);
						System.out.println("A porcentagem dos números ímpares é "  + porcentagem + "%");
						
			}}
	
	

