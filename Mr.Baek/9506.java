
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			a = sc.nextInt();
			if (a!=-1) {
				int count=0;
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
				int sum=0;
				for (int k=0;k<count-1;k++) {
					sum+=b[k];
				}
				if (sum==a) {
					System.out.print(a+" = ");
					for (int l=0;l<count-1;l++) {
						System.out.print(b[l]);
						if (l!=count-2) {
							System.out.print(" + ");
						}
					}
					System.out.println();
				}else {
					System.out.println(a+" is NOT perfect.");
				}
			}else {
				break;
			}
		}while(a!=-1);
	}
}