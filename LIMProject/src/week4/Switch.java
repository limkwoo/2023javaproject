package week4;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		int y = 2;
		int z = 3;
		
		System.out.println(x + ", "  + y + ", " + z);
		
		switch(x) {
		case 0: z=x+1; break;
		case 1: y=z+x; break;
		default: z=z+x;
		
		}

	}

}
