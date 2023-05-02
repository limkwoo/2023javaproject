
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a= new int[num];
		for (int i =0;i<num;i++) {
			a[i] = sc.nextInt();
		}
		int max= a[0];
		int min= a[0];
		
		for (int j=0;j<a.length;j++) {
			if (max<=a[j]) {
				max = a[j];
			}
		}
		for (int k=0;k<a.length;k++) {
			if (min>=a[k]) {
				min = a[k];
			}
		}
		System.out.print(min+" "+max);
	}
}