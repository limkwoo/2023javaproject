
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		int b = sc.nextInt();
		char c = a.charAt(b-1);
		System.out.println(c);
	}

}