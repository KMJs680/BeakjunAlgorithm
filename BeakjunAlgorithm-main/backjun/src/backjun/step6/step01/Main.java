package backjun.step6.step01;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger scr= new BigInteger(String.valueOf(sc.nextInt()));
		
		System.out.println(scr.multiply(BigInteger.valueOf(4)));
	}

}
