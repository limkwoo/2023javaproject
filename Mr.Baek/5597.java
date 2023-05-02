
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a=new int[28];
		int[] b=new int[30];
				
		for (int i=0;i<28;i++) {
			a[i]=sc.nextInt();
		}
		for (int j=0;j<30;j++) {
			b[j] = j+1;
		}
		for (int k=0;k<30;k++) {
			for (int l=0;l<28;l++) {
				if (b[k]==a[l]) {
					b[k]=0;
				}
			}
		}
		int max=0;
		int min=0;
		int stop=0;
		for ( int m=0;m<30;m++) {
			if (b[m]!=0) {
				min = b[m];
				stop=m;
				break;
			}
		}
		for ( int n=stop+1;n<30;n++) {
			if (b[n]!=0) {
				max = b[n];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}