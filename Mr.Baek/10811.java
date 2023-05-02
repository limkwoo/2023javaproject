
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr= new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=i+1;
		}
		//		int aa=0;
		//		int bb=0;
		for (int j=0;j<m;j++) {

			int a= sc.nextInt();
			int b= sc.nextInt();
			int var=b-a;
			if (var%2!=0) {
				for (int k=0;k<(var+1)/2;k++) {
					int aa=arr[a+k-1];
					int bb=arr[b-k-1];
					arr[a+k-1] = bb;
					arr[b-k-1] = aa;
				}

			}else {
				for (int l=0;l<var/2;l++) {
					int aaa = arr[a+l-1];
					int bbb = arr[b-l-1];
					arr[a+l-1] = bbb;
					arr[b-l-1] = aaa;
				}

			}

		}
		for (int o=0;o<n;o++) {
			System.out.print(arr[o]+" ");
		}
	}
}