package elevadores;

import java.util.Scanner;

public class Elevadores {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int preferenciaA = 0;
		int preferenciaB = 0;
		int preferenciaC = 0;

		int Amanha = 0;
		int Bmanha = 0;
		int Cmanha = 0;

		int AVespertino = 0;
		int BVespertino = 0;
		int CVespertino = 0;

		int ANoturno = 0;
		int BNoturno = 0;
		int CNoturno = 0;
				
		int elevadorMaisUtilizado = 0;
		
		
		int manha = 0;
		int vespertino = 0;
		int noite = 0;
		
		int maiorFluxo = 0;

		for (int i = 0; i <= 49; i++) {

			System.out.println("Escolha  o elevador que voc� mais utiliza ?(A, B, C)");
			char escolha = scan.next().charAt(0);
			if (escolha == 'A') {
				preferenciaA++;
			} else if (escolha == 'B') {
				preferenciaB++;
			} else if (escolha == 'C') {
				preferenciaC++;
			}

			System.out.println("Em que periodo vc mais utiliza O elevador  ?(M, N, V)");
			char periodo = scan.next().charAt(0);
			if (escolha == 'A' && periodo =='M') {
				Amanha++;
				manha++;
			} else if (escolha == 'B' && periodo =='M') {
				Bmanha++;
				manha++;

			} else if (escolha == 'C' && periodo =='M') {
				Cmanha++;
				manha++;

			}
			
			if (escolha == 'A' && periodo =='N') {
				ANoturno++;
				noite++;
			} else if (escolha == 'B' && periodo =='N') {
				BNoturno++;
				noite++;

			} else if (escolha == 'C' && periodo =='N') {
				CNoturno++;
				noite++;

			}
			
			if (escolha == 'A' && periodo =='V') {
				AVespertino++;
				vespertino++;
			} else if (escolha == 'B' && periodo =='V') {
				BVespertino++;
				vespertino++;

			} else if (escolha == 'C' && periodo =='V') {
				CVespertino++;
				vespertino++;

			}
		
		}
		
		
		// Elevador mais Utilizado
		if(preferenciaA > preferenciaB && preferenciaA > preferenciaC) {                           
			elevadorMaisUtilizado = preferenciaA;
			System.out.println("Elevador mais utilizado � o A, utilizado por "+preferenciaA+" pessoas");
		}
		
		else if(preferenciaB > preferenciaC && preferenciaB > preferenciaA)  {
			elevadorMaisUtilizado = preferenciaB;
			System.out.println("Elevador mais utilizado � o B, utilizado por "+preferenciaB+" pessoas");
			
		}else {
	
			System.out.println("Elevador mais utilizado � o C, utilizado por "+preferenciaC +" pessoas");

		}
		
		
		//Periodo mais utilizado
		if(vespertino>noite && vespertino>manha) {
			maiorFluxo = vespertino;
			System.out.println("O maior fluxo ocorre no per�odo vespertino, de "+ maiorFluxo +"pessoas");

			
		}else if(noite>vespertino && noite>manha){
			maiorFluxo = noite;
			System.out.println("O maior fluxo ocorre no per�odo da noite, de "+ maiorFluxo +"pessoas");
		}
		
		else {
			maiorFluxo = manha;
			System.out.println("O maior fluxo ocorre no per�odo da manh�, de "+ maiorFluxo +"pessoas");

		}
		
		
		
		
			

	}

}
