
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double[] score= new double[n];
		for (int i=0;i<n;i++) {
			score[i]=sc.nextDouble();
		}
		double max = score[0];
		for (int j=0;j<n;j++) {
			if (max<=score[j]) {
				max = score[j];
			}
		}
		double total=0;
		for (int k=0;k<n;k++) {
			score[k] = (score[k]/max)*100;
			total+=score[k];
		}
		System.out.println(total/n);

		
	}
}