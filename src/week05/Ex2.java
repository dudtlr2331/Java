package week05;

public class Ex2 {
	public static void main(String[] args) {
		int dan ;
		for (int i=2; i<=9; i+=4) {
			dan = i;
			for (int j=1; j<=9; j++) {
				for (int k=0; k<4; k++)
					System.out.printf("\t%2d*%2d=%3d",dan+k,j, (dan+k)*j);
				System.out.printf("\n");
				}
			System.out.println();
		}
	}
}
