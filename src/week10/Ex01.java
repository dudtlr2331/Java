package week10;

public class Ex01 {
	public static void main(String[] args) {
		String str = "   ȫ �浿  AB CD 123 45";
		String result = "";
		String result2 = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				result += str.substring(i, i+1);
				result2 += str.charAt(i);
			}
		}
		
		System.out.println("ó����       ==> [" + str + "]");
		System.out.println("ó����(��������)       ==> ["+ result +"]");
		System.out.println("ó����(��������)       ==> ["+ result2 +"]");
	}
}
