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
		
		System.out.printf("�簢���� ������ %d\n", area);
		
		if(rect.isSquare(rect.width, rect.height) == true)
			System.out.println("���簢���Դϴ�.");
		else
			System.out.println("���簢���� �ƴմϴ�.");
		
	}
}