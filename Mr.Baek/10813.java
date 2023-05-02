
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];
		for (int i=0;i<n;i++) {
			num[i] = i+1;		
		}
		for (int j=0;j<m;j++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int aa= num[a-1];
			int bb= num[b-1];
			num[a-1] = bb;
			num[b-1] = aa;
		}
		for(int k=0;k<n;k++) {
			System.out.print(num[k]+" ");
		}

	}
}