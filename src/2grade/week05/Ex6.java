package week05;

public class Ex6 {
	public static void main(String[] args) {
		System.out.println("20을 왼쪽으로 2bit 쉬프트한 결과 : " + Integer.toBinaryString(20 << 2));
		System.out.println("20을 오른쪽으로 2bit 쉬프트한 결과 : " + Integer.toBinaryString(20 >> 2));
		
		byte slVal, srVal, result;
		// -20 : 1 1 1 0 1 1 0 0 ->2'보수
		slVal = 20 << 2;
		srVal = 20 >> 2;

		for (int i = 0; i < 2; i++) {
			for (byte k = 7; k >= 0; k--) {
				if (i == 0) // 왼쪽 쉬프트일 경우
					result = (byte) (slVal >> k);
				else
					result = (byte) (srVal >> k);
				System.out.printf("%3d", result & 0x01);
			}
			System.out.println();
		}

	}

}
