package week11;

public class Array6Demo {
	public static void main(String[] args) {
		
	int socores[][][] = {
							{
								{70,80,85,90},
								{45,90,55,80},
								{78,80,65,95},
							},
							{
								{75,75,80,70},
								{50,80,95,60},
								{80,60,65,90},
							}
						};
	//socores.length : ���� ����
	//socores[i].length : i�� ���� �� ����
	// socores[i][j].length : i�� ���� j���� ����
	for (int i = 0; i < socores.length; i++) {
		for (int j = 0; j < socores[i].length; j++) {
			System.out.println("==[" + i + "��][" + j + "��] �ε����� ����� ����==");
			for (int k = 0; k < socores[i][j].length; k++) {
				System.out.println("==[" + i + "��][" + j + "��][" + k +"��]==>" + socores[i][j][k]);
			}
			System.out.println();
		}

	}
}
}