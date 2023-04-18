package week5;

import java.util.Scanner;

public class looppractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int count = 0;
		do {
			a = sc.nextInt();
			if (a%3!=0 && a%5!=0 && a!=0) {
				count++;
			}
		}while(a!=0);
		System.out.println(count);
	}

}
