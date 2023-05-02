
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.nextLine();
		int b = a.length();
		char[] c = new char[b];
		int[] abc = new int[26];
		for (int i=0;i<26;i++) {
			abc[i] = -1;
		}
		for (int x=0;x<b;x++) {
			c[x]=a.charAt(x);
		}
		char[] check = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		//알파벳 배열에 모두 -1넣고 , 입력받았고, 입력받은 문자열의 길이만큼의 배열도 생성완료
		// [ 입 력 받 은 거 ] <--처음 등장한 위치 저장
		for (int k=0;k<26;k++) {
			for (int l=0;l<b;l++) {
				if (check[k]==c[l]) {
					abc[k] = l;
					break;
				}
			}
		}
		
		
		//출력
		for (int j=0;j<26;j++) {
			System.out.print(abc[j]+" ");
		}
		
		
	}
}



