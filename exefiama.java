package fefe.project;

import java.util.Scanner;

public class exefiama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double	valor, taxa, tempo, prest;
		System.out.println("insira o valor");
		valor = sc.nextDouble();
		System.out.println("insira a taxa");
		taxa = sc.nextDouble();
		System.out.println("insira o tempo");
		tempo = sc.nextDouble();
		prest = (valor+(valor*(taxa/100)*tempo));
		System.out.println("o valor da prestação é" + prest);
	}

}
