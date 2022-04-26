package ex1;

import java.util.Scanner;

public class calculadoraNota {

	public static void main(String[]args) 
	{
		Scanner ler = new Scanner(System.in);//criando scaner
		double ac1,ac2,ag,af,media;	
		double peso1,peso2,peso3,peso4;
		peso1 = 1.5; peso2 = 3.0; peso3 = 1.0; peso4 = 4.5;
		
		System.out.println("Digite sua nota da ac1"); //recebendo nota ac1
		  ac1 = ler.nextDouble();
		  ac1 = ac1*peso1; //calculando nota ac1
		System.out.println("Digite sua nota da ac2"); //recebendo nota ac2
		  ac2 = ler.nextDouble();
		  ac2 = ac2*peso2; //calculando nota ac2
		System.out.println("Digite sua nota da ag"); //recebendo nota ag
		  ag = ler.nextDouble();
		  ag = ag*peso3; //calculado nota ag
		System.out.println("Digite sua nota da af"); //recebendo nota af
		  af = ler.nextDouble();
		  af = af*peso4; // calculando nota af
		media = ac1+ac2+ag+af; //calculando media final
		
		if(media >= 50.0) { 
			//se estiver acima ou na media
			System.out.println("você passou parabens");
		}else {
			//se estiver abaixo da media
			System.out.println("você reprovou F");
		}
	}
}
