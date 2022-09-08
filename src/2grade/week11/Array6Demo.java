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
	//socores.length : 면의 길이
	//socores[i].length : i번 면의 행 길이
	// socores[i][j].length : i번 면의 j행의 길이
	for (int i = 0; i < socores.length; i++) {
		for (int j = 0; j < socores[i].length; j++) {
			System.out.println("==[" + i + "면][" + j + "행] 인덱스에 저장된 정수==");
			for (int k = 0; k < socores[i][j].length; k++) {
				System.out.println("==[" + i + "면][" + j + "행][" + k +"열]==>" + socores[i][j][k]);
			}
			System.out.println();
		}

	}
}
}