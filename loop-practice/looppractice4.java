package week5;

import java.util.Scanner;

public class looppractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int i=1;
		while (i<=a) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
