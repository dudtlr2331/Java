package week10;

public class Array3Demo {
	public static void main(String[] args) {
		int scores[][] = new int [3][4];
		
		for(int i = 0; i < scores.length; i++) {
			for(int j=0; j <scores.length; j++)
				scores[i][j] = (i+1*j)*3;
		}
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("==["+ i + "]�� �� �ε����� ����� ����==");
			for(int j=0; j <scores.length; j++) 
				System.out.println("scores[" + i + "][" + j +"]==>" + scores[i][j]);
			System.out.println();
		}
	}
}
