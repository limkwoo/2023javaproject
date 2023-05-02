
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] goal = new int[n];
		
		for (int i=0;i<m;i++) {
			
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
				for (int j=a;j<=b;j++) {
					goal[j-1]= c;
				}
		}
		for (int k=0;k<goal.length;k++ ) {
			System.out.print(goal[k]+" ");
		
		}
	}
}