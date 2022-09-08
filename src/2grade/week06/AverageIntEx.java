//package week06;
//
//import java.util.Scanner;
//
//class AverageIntEx {
//	public static void main(String[] args) {
//		AverageIntEx ai = new AverageIntEx();
//		ai.inputData();
//		System.out.println("평균 값 : " + ai.getAverageInt());
//	}
//}
//
//
//public class AverageInt{
//	private int cnt = 0;
//	private int sum = 0;
//	private double average = 0.0;
//	
//	public double getAverageInt() {
//		return average;
//	}
//	
//	private void calcAverage() {
//		average = ((double)sum / cnt);
//	}
//	
//	public void inputData() {
//		int loop=1, num;
//		Scanner in = new Scanner(System.in);
//		for(int i=1;;i++) {
//			System.out.println(i+"번째 정수 입력 : ");
//			num = in.nextInt();
//			if(num <= 0)
//				break;
//			this.cnt ++;
//			this.sum += num;
//		}
//		calcAverage();
//	}
//}