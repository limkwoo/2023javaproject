package week5;

import java.util.Scanner;

public class looppractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		float s1;
		int var = 0;
		
		String d = "a";
		do {
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = (a*b*5);
			s1 = (float)c/10;
			System.out.println(s1);
			System.out.println("Continue?");
			d = sc.next();
			switch (d) {
			case "Y": var=1; break;
			case "y": var=1; break;
			default : var=0; break;
			}
		}while(var!=0);
	}

}
