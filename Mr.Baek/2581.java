
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int sum=0;
		int count = 0;
		int count2=0;
		int count3=0;
		int first =0;
		for (int i=a;i<=b;i++) {
			count =0;
			for (int j=1;j<=i;j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==2) {
				count2++;
				sum+=i;
			}
			if (count2==1 && count3==0) {
				first = i;
				count3++;
			}
		}
		if (sum!=0) {
 		System.out.println(sum);
		System.out.println(first);
		}else {
			System.out.println("-1");
		}
	}

}