
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = sc.nextInt();
		int count =0;
		for (int i=1;i<=a;i++) {
			if (a%i==0) {
				count++;
				
			}
		}
		int[] b=new int[count];
		int count2=0;
		for (int j=1;j<=a;j++) {
			if (a%j==0) {
				b[count2]=j;
				count2++;
			}
		}
		if (c>count) {
			System.out.print("0");
		}else {
		System.out.println(b[c-1]);
		}
	}
}