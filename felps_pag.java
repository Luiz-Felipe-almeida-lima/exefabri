package felps_pag;

import java.util.Scanner;

public class felps_pag {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double altura;
		System.out.println("insira a sua altura: ");
		altura = sc.nextDouble();
		double peso;
		System.out.println("insira o seu peso: ");
		peso = sc.nextDouble();
		double imc;
		imc = (peso/(altura*altura));
		if(imc<18);
		System.out.println("magreza extrema");
		if(imc>18);
		System.out.println("normal");
		}
      
	}  

