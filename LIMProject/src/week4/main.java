package week4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;

		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		number = sc.nextInt();
		if( 0 <= number && number <= 100) {
			if(number >= 90) {
				System.out.println("학점 A");	
		}		
		else if(number >= 80) {
			System.out.println("학점 B");
		}
		else if(number >= 70) {
			System.out.println("학점 C");
		}
		else {
			System.out.println("학점 F");
		}
		}
		else {
			System.out.println("잘못된 값입니다.");
		}

		
}
}
