package sw.d2.d20210515.sw1926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//
public class Solustion {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			String snum = Integer.toString(i);
			char[] arrNum = snum.toCharArray();
			int dashCnt=0;
			for(int j=0; j<arrNum.length; j++) {
				if(arrNum[j]!='0' && arrNum[j]%3==0) {
					dashCnt++;
				}
			}
			if(dashCnt>0) {
				for(int j=0; j<dashCnt; j++) {
					System.out.print("-");
				}
			}else {
				System.out.print(i);
			}
			System.out.print(" ");
		}

//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int tc=Integer.parseInt(br.readLine());
//        System.out.println(tc);
//        
//        
//        for(int i=1; i <= tc; i++) {
//        	String str = Integer.toString(i);
//        	boolean a = true;
//        	boolean b = true;
//        	
//        	for(int j=0; j < str.length(); j++) {
//        		if(str.charAt(0) == '3' || str.charAt(0) == '6' || str.charAt(0) == '9') {
//        			a = true; b = false;
//        		}
//        		else if((str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') && str.charAt(0) == '3' || str.charAt(0) == '6' || str.charAt(0) == '9') {
//        			a = false; b = false;
//        		}
//        		else {
//        			a = true; b = true;
//        		}
//        	}     
//        	
//        	if(b) {
//        		System.out.println(i);
//        	}
//        	else if(a && !b){
//        		System.out.println("-");
//        	}else if(!a && !b) {
//        		System.out.println("--");
//        	}
//        }
	}
}
//if(i % 2 == 0 && i > 10) {
//	System.out.println("--");
//}

//3 6 9 13 16 19 23 26 29 31 32 33 35 36

//if(i % 3 == 0) {
//	System.out.println("-");
//}else {
//	System.out.println(i);
//}




//for(int i=1; i <= tc; i++) {
//	String str = Integer.toString(i);
//	
//	for(int j=0; j < str.length(); j++) {
//		if(str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') System.out.println("-");
//		else if(str.charAt(j) == '3' && str.charAt(j+1) == '6') System.out.println("--");
//		else System.out.println(i);
//	}     
//}