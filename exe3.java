package felps_pag;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       double alt, raio, vol;
       System.out.println("insira a altura da lata");
       alt = sc.nextDouble();
       System.out.println("insira o raio da lata");
       raio = sc.nextDouble();
       vol = (3.14159*(raio*raio)+alt);
       System.out.println("o volume é: " + vol);
	}

}
