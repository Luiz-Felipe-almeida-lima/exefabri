package fefe.project;

import java.util.Scanner;

public class exefi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        
        
        System.out.println("insira um numero para A");
        a = sc.nextDouble();
        
        
        System.out.println("insira um numero para B");
        b = sc.nextDouble();
        
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("o valor de A é " + a + "o valor de B é " + c);
        		
        		
	}

}
