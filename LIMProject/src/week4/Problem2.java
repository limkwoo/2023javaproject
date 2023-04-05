package week4;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String grade = sc.next();
		
		switch(grade) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D":
			System.out.println("Effort");
			break;
		case "F":
			System.out.println("Fallure");
			break;
			default:
				System.out.println("error");
				break;
		}

	}

}
