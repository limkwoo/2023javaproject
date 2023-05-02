
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b=0;
		int count =0;
		int count2=0;
		for (int i=0;i<a;i++) {
			count=0;
			b=sc.nextInt();
			for (int j=1;j<=b;j++) {
				if (b%j==0) {
					count++;
				}
			}
			if (count!=2) {

			}else {
				count2++;
			}

		}
		System.out.println(count2);
	}
}