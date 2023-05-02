import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String b = sc.next();
		char a1 = a.charAt(0);
		char a3 = a.charAt(2);
		
		char b1 = b.charAt(0);
		char b3 = b.charAt(2);
		
		int newa= 100*(a3-'0')+10*(a.charAt(1)-'0')+a1-'0';
		int newb= 100*(b3-'0')+10*(b.charAt(1)-'0')+b1-'0';
		
		if (newa>newb) {
			System.out.println(newa);
		}else {
			System.out.println(newb);
		}
	
	
	
	
	
	}
}



