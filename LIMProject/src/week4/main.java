package week4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		number = sc.nextInt();
		if( 0 <= number && number <= 100) {
			if(number >= 90) {
				System.out.println("���� A");	
		}		
		else if(number >= 80) {
			System.out.println("���� B");
		}
		else if(number >= 70) {
			System.out.println("���� C");
		}
		else {
			System.out.println("���� F");
		}
		}
		else {
			System.out.println("�߸��� ���Դϴ�.");
		}

		
}
}
