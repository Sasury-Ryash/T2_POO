package Questão_4;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
			 // Faça um programa que mostre a data e a hora do sistema nos 
				//seguintes formatos:DD/MM/AAAA - mês por extenso e hora:minuto.
			int dia, mes, ano = 0, hora = 0, min = 0;
			Calendar cal = Calendar.getInstance();
			Date d = new Date();
			cal.setTime(d);
			dia = cal.get(Calendar.DAY_OF_MONTH);
			mes = cal.get(Calendar.MONTH) + 1;
			ano = cal.get(Calendar.YEAR);
			hora = cal.get(Calendar.HOUR);
			min = cal.get(Calendar.MINUTE);
			  System.out.println("Seu sistema indica que seu calendário e seu horário são: " + d);
			  System.out.println("Data e hora atual: " + dia + "/" + mes + "/" + ano + " - " + hora + ":" + min);
			  switch(mes)
			  {
			      case 1:
			    	  System.out.println("O mês é janeiro.\n");
			      break;

			      case 2:
			    	  System.out.println("O mês é fevereiro.\n");
				      break;

			      case 3:
			    	  System.out.println("O mês é março.\n");
				      break;

			      case 4:
			    	  System.out.println("O mês é abril.\n");
			      break;

			      case 5:
			    	  System.out.println("O mês é maio.\n");
			      break;

			      case 6:
			    	  System.out.println("O mês é junho.\n");
			      break;

			      case 7:
			    	  System.out.println("O mês é julho.\n");
			      break;

			      case 8:
			    	  System.out.println("O mês é agosto.\n");
			      break;

			      case 9:
			    	  System.out.println("O mês é setembro.\n");
			      break;

			      case 10:
			    	  System.out.println("O mês é outubro.\n");
			      break;

			      case 11:
			    	  System.out.println("O mês é novembro.\n");
			      break;

			      case 12:
			    	  System.out.println("O mês é dezembro.\n");
			      break;

			      default:
			    	  System.out.println("O mês informado não confere.\n");

			  }

			  hora=(int)hora;
			  min=(hora)*100;
		}


	}
