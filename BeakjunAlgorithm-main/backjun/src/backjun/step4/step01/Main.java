package backjun.step4.step01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		
		int quarter;
		int dime;
		int nickel;
		int penny;
		
		for(int i=0; i<type;i++) {
			int c = sc.nextInt();
			
			quarter = c/25;
			c%=25;
			
			dime = c/10;
			c %= 10;
			
			nickel = c/5;
			c%=5;
			
			penny = c;
			
			
			System.out.println(quarter + " " +dime + " " +nickel + " " + penny);
		}
		sc.close();
		
		
		

	}

}
