
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		do {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a==0 && b==0 ) {
				break;
			}
			else if (a%b==0) {
				System.out.println("multiple");
			}else if (b%a==0){
				System.out.println("factor");
			}else {
				System.out.println("neither");
			}
		}while(a!=0 && b!=0);
	}
}