//package week10;
//
//import java.util.Scanner;
//
//class Circle {
//	private double x, y;
//	private double radius;
//
//	public Circle(double x, double y, double radius) {
//		this.x = x;
//		this.y = y;
//		this.radius = radius;
//	}
//
//	public void show() { // 출력 show 메서드
//		System.out.println("x : " + x + " , y : " + y + " , radius : " + radius);
//	}
//
//	public double getArea() { // 면적 계산 메서드 실수 계산이 들어가서 반환형은 double로
//		return 3.14 * radius * radius;
//	}
//}
//
//public class Ex05 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); // 키 입력 받기 위해
//		Circle c[] = new Circle[3]; // 써클 객체 배열 선언
//
//		for (int i = 0; i < c.length; i++) {
//			System.out.print(i + 1 + "번째 원의 x, y, radius 값을 입력해주세요 >> ");
//			double x = sc.nextDouble(); // 스캐너 객체를 통해 문자열로 받기 때문에
//			double y = sc.nextDouble(); // 해당 변수 자료형에 맞는 형태로 변환
//			double radius = sc.nextInt();
//			c[i] = new Circle(x, y, radius); // 받은 변수를 써클 생성자로 객체 생성
//		}
//		
//		int max = 0;
//		double temp = 0.0;
//		
//		for (int i = 0; i < c.length; i++) { // 써클 객체의 show 메서드 호출하면서 면적 값 정렬
//			c[i].show();
//			if (c[i].getArea() > temp) {
//				max = i;
//				temp = c[i].getArea();
//			}
//		}
//
//		System.out.print("가장 면적이 큰 원은 ");
//		c[max].show();
//
//	}
//}
