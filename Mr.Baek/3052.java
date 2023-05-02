
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//입력
		int[] num= new int[10];
		for (int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		//입력받은값의 나머지
		int[] rem= new int[10];
		for (int j=0;j<rem.length;j++) {
			rem[j] = num[j]%42;
		}
		
		//0~41까지 있는 박스
		int[] nat=new int[42];
		for (int k=0;k<nat.length;k++) {
			nat[k]=k;
		}
		//비교해서 있으면 상자에 표시
		for (int l=0;l<42;l++) {
			for(int m=0;m<10;m++) {
				if (nat[l]==rem[m]) {
					nat[l]=1000;
				}
			}
		}
		
		//표시된상자볼때마다count업
		int count=0;
		for (int n=0;n<42;n++) {
			if(nat[n]==1000) {
				count++;
			}
		}
		System.out.print(count);
	}
}