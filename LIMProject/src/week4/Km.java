package week4;

import java.util.Scanner;

public class Km {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("속도를 입력하시오: ");
		number = sc.nextInt();
		if(number >= 60 && number <= 100) {
			System.out.println("정상 속도");
		
		}

	}

}
