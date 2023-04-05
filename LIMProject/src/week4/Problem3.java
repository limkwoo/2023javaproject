package week4;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		number = sc.nextInt();
		if(number==1) {
			System.out.println("dog");
		}
		else if(number==2) {
			System.out.println("cat");
		}
		else if(number==3) {
			System.out.println("chick");
		}
		else {
			System.out.println("I don't know.");
		}

	}

}
