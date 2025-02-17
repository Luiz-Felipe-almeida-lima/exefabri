package felps_pag;

import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       double temp, vel, dist, lit;
       
       System.out.println("insira o tempo utilizado: ");
       temp = sc.nextDouble();
       
       System.out.println("insira a velocidade do carro: ");
       vel = sc.nextDouble();
       
       dist = (temp*vel);
       
       lit = (dist/12);
       
       System.out.println("foram usados" +  lit  "litros");
       
	}

}
