package �ȳ��ϼ���;

import java.util.Scanner;

public class Th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("��ȣ�� �����Ͻÿ�:");
		int a = sc.nextInt();
		
		System.out.println((a==1) ? "ȭ���µ��� �Է��Ͻÿ�: " : "�����µ��� �Է��Ͻÿ�: ");
		float temp = sc.nextFloat();
		System.out.println((a==1) ? "�����µ��� "+(temp-32)*5/9 : "ȭ���µ���"+(temp*9/5)+32);

	}

}
