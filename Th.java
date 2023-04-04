package 안녕하세요;

import java.util.Scanner;

public class Th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("번호를 선택하시오:");
		int a = sc.nextInt();
		
		System.out.println((a==1) ? "화씨온도를 입력하시오: " : "섭씨온도를 입력하시오: ");
		float temp = sc.nextFloat();
		System.out.println((a==1) ? "섭씨온도는 "+(temp-32)*5/9 : "화씨온도는"+(temp*9/5)+32);

	}

}
