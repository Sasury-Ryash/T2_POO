package Questão_3;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		// crie um código que resolva equações de 2° grau.
				double x1, x2;
				int a,b,c;
				a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do primeiro coeficiente da equação: "));
				b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do segundo coeficiente da equação: "));
				c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do terceiro coeficiente da equação: "));
				double del = Math.pow(b, 2)-4*a*c;
				System.out.println("Sua equação é: " +a+ "x" +b+ "y" +c);
				if (del > 0) {
					x1 = ((-b + (Math.sqrt(del))) / (2*a));
					x2 = ((-b - (Math.sqrt(del))) / (2*a));
					System.out.println("A primeira raiz da equação vale: " + x1);
					System.out.println("A segunda raiz da equação vale: " + x2);
			}
				else {
					System.out.println("Delta é invalido, portanto não é possivel resolver sua equação.");
				}
			}
	}

