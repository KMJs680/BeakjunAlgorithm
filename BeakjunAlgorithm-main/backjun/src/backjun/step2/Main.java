package backjun.step2;


import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger bg = new BigInteger(sc.next());
		BigInteger bg2 = new BigInteger(sc.next());
		
		System.out.println(bg.add(bg2));
		

	}

}
