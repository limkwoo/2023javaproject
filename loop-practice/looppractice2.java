package week5;

import java.util.Scanner;

public class looppractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int b;
		for (int i=0;i+a<=100;i++) {
			b=a+i;
			sum+=b;
		}
		System.out.println(sum);
	}

}
