package Questão_7;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	    int qntJog, qntTime, idade, qtde, tot80;
	    double medId, medAlt, porc, alt, peso;
	    System.out.println("Bem vindo(a) ao Sistema de Controle de Times Para Campeonatos Seguros!");
	    System.out.println("A seguir faremos algumas perguntas, por favor responda com os dados dos jogadores cadastrados neste campeonato!");
	    
	 qtde = 0;
	 tot80 = 0;
	    for (qntTime = 1; qntTime <= 5; qntTime++){
	  medId = 0;
	  medAlt = 0;
	  for (qntJog = 1; qntJog <= 11; qntJog++) {
		 idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do jogador " + qntJog + ";"));
		 peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do jogador " + qntJog + ";"));
		 alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do jogador " + qntJog + ";"));
		 if (idade < 18) {
			 qtde = qtde + 1;
			 medId = medId + idade;
			 medAlt = medAlt + alt;
			 if (peso > 80) {
				 tot80 = tot80 + 1;
	}
			 medId = medId/11;
	}
	  }
		 System.out.println("A media de idade dos jogadores do time " + qntTime + "é: " + medId);
	  System.out.println("A quantidade de Jogadores menores de 18 é: " + qtde);
		 medAlt = medAlt/55;
		 System.out.println("A media dde altura dos jogadores deste campeonato é: " + medAlt);
		 porc = tot80 * 100/55;
		 System.out.println("A porcentagem de jogadores acima de 80kg é: " + porc);
}
}
}