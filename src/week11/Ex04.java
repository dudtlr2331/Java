package week11;

public class Ex04 {//4. ����(�迭)�� ���� �޼��� ȣ��
	public static void main(String[] args) {
		int [] arr = { 1, 2, 3 };
		for (int x : arr )
			System.out.printf("%d ", x);
		
		System.out.printf("\nincrement �޼ҵ� ȣ�� ~~~ \n");
		
		increment(arr);
		for(int x : arr) {
			System.out.printf("%d ", x);
		}
	}
	
	public static void increment(int[] n) {
		for (int i=0; i<n.length; i++) {
			n[i] *=10;
		}
		return;
	}
}
