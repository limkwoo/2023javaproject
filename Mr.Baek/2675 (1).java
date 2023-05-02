
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<a;i++) {
			int repeat = sc.nextInt();
			String b = sc.next();
			int length = b.length();
			//길이만큼 반복한다 안에 반복횟수만큼 반복 ex)3 abc ->aaabbbccc
			for (int j=0;j<length;j++) {
				for (int k=0;k<repeat;k++) {
					System.out.print(b.charAt(j));
				}
			}
			System.out.println();

		}

	}
}



