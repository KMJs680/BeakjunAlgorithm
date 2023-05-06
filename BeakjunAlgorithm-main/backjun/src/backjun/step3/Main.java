package backjun.step3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int width =3;
		
		int[] one = new int[16];
		for(int i=1; i<one.length; i++) {
			one[i] = width * width;
			width = width +(width-1);
		}
		System.out.println(one[num]);
		sc.close();

	}

}
