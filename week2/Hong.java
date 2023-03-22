package week1;
import java.util.Scanner;




public class Hong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오: ");
		String s1  = sc.nextLine();
		
		System.out.println("나이를 입력하시오: ");
		int y = sc.nextInt();
		
		System.out.println(s1 +"님 안녕하세요! " + y + "살이시네요.");
		

	}

}
