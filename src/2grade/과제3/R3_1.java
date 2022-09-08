package 과제3;

import java.util.Scanner;

class ManagerString {
	String strArray[]=null;
	int size;
	public ManagerString(int size) {
		strArray = new String[size];
		this.size = size;
	}
	protected void inputString() {
		Scanner s = new Scanner(System.in); 
		for(int i=0; i<size; i++) {
			System.out.print("[" + i + "]번째 문자열 : ");
			strArray[i] = s.next(); // 1점
		}
	}
	protected int seekSame() {
		int cnt=0;
		String str;
		
		for(int i=0; i<size; i++) {
			str = strArray[i];
			int len = str.length();
			boolean flag=true;  // 정방향/역방향이 동일한 문자열인지 여부를 판단
			for(int j=0; j<(len/2); j++) {
				if(str.charAt(j) != str.charAt(len-j-1)) 
					flag = false;
			}
			if(flag)
				cnt++;
		}
		
		return cnt;
	}
}
public class R3_1 {
	public static void main(String[] args) {
		ManagerString ms = new ManagerString(3);
		ms.inputString();
		System.out.println("정방향/역방향 문자열 갯수 : " + ms.seekSame());
	}
}