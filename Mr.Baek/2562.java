
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a= new int[9];
		for (int i =0;i<9;i++) {
			a[i] = sc.nextInt();
		}
		int max= a[0];
		for (int j=0;j<a.length;j++) {
			if (max<=a[j]) {
				max = a[j];
			}
		}
		int loc=0;
		for (int k=0;k<a.length;k++) {
			if (a[k]==max) {
				loc=k;
			}
		}
		System.out.println(max);
		System.out.println(loc+1);
		
	}
}