package week12;

class MyRectangle{
	int width;
	int height;
	
	int getArea() {
		return width * height;
	}
	
	boolean isSquare(int width, int height) {
		if(width == height)
			return true;
		else
			return false;
			
	}
}

public class RectDemo { 
	public static void main(String[] args) {
		MyRectangle rect = new MyRectangle();
		
		rect.width = 4;
		rect.height = 5;
		
		int area = rect.getArea();
		
		System.out.printf("사각형의 면적은 %d\n", area);
		
		if(rect.isSquare(rect.width, rect.height) == true)
			System.out.println("정사각형입니다.");
		else
			System.out.println("정사각형이 아닙니다.");
		
	}
}