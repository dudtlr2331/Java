package week11;

public class Ex04 {//4. 참조(배열)에 의한 메서드 호출
	public static void main(String[] args) {
		int [] arr = { 1, 2, 3 };
		for (int x : arr )
			System.out.printf("%d ", x);
		
		System.out.printf("\nincrement 메소드 호출 ~~~ \n");
		
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
