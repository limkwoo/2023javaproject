package week4;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		number = sc.nextInt();
		if(number>0) {
			System.out.println("plus");
		}
		else if(number==0) {
			System.out.print("zero");
		}
		else {
			System.out.print("minus");
		}

	}

}
