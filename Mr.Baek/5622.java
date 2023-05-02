
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int length = a.length();
		char[] b = new char[length];
		for (int i=0;i<length;i++) {
			b[i]=a.charAt(i);
		}
		int count =0;
		for (int j=0;j<length;j++) {
			switch (b[j]) {
			case 'A':
			case 'B':
			case 'C': count=count+3;
			break;
			case 'D':
			case 'E':
			case 'F': count=count+4;
			break;
			case 'G':
			case 'H':
			case 'I': count=count+5;
			break;
			case 'J':
			case 'K':
			case 'L': count=count+6;
			break;
			case 'M':
			case 'N':
			case 'O': count=count+7;
			break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S': count=count+8;
			break;
			case 'T':
			case 'U':
			case 'V': count=count+9;
			break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z': count=count+10;
			break;	
			}
		}
		System.out.println(count);
	}
}



