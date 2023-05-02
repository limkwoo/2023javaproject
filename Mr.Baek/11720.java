
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		String b = sc.next();
		int sum=0;
		for (int i=0;i<a;i++) {
			int c = b.charAt(i)-'0';
			sum+=c;
		}
		System.out.println(sum);
	}
}



