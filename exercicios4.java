package felps_pag;

import java.util.Scanner;

public class exercicios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       double graus;
       System.out.println("insira os graus");
       graus = sc.nextDouble();
       double far;
       far = (graus * 9 / 5 + 32);
       System.out.println("os graus em Fahrenheit são " + far);
	}

}
