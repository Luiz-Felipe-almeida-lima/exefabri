package felps_pag;

import java.util.Scanner;

public class exer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int fah;
        System.out.println("insira os fahrenheit");
        fah = sc.nextInt();
        int graus;
        graus = (((fah-32)*5) / 9);
        System.out.println("a temperatura em graus é: " +  graus);
	}

	private static int fah(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
