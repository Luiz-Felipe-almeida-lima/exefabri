package fefe.project;

import java.util.Scanner;

public class caipira {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double A, B, C, D;
        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        C = sc.nextDouble();
        
        System.out.print("Digite o valor de D: ");
        D = sc.nextDouble();
        
        
        System.out.println("Somas:");
        System.out.println("A + B = " + (A + B));
        System.out.println("A + C = " + (A + C));
        System.out.println("A + D = " + (A + D));
        System.out.println("B + C = " + (B + C));
        System.out.println("B + D = " + (B + D));
        System.out.println("C + D = " + (C + D));
        
        System.out.println("Multiplicações:");
        System.out.println("A * B = " + (A * B));
        System.out.println("A * C = " + (A * C));
        System.out.println("A * D = " + (A * D));
        System.out.println("B * C = " + (B * C));
        System.out.println("B * D = " + (B * D));
        System.out.println("C * D = " + (C * D));
	}
}
