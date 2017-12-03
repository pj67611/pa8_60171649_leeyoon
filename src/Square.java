//60171649 이윤
public class Square extends Shape {
	int width;
	int left_bottom_x;
	int left_bottom_y;
	int right_top_x;
	int right_top_y;
	int Area;
	int Length;
	
	public Square(int x,int y,int width) {
		this.width = width;
		this.left_bottom_x = x;
		this.left_bottom_y = y;
		this.right_top_x = x + width;
		this.right_top_y = y + width;
		this.Area = width*width;
		this.Length = 4*width;
	}

	@Override
	public void draw() {
		//정사각형 왼쪽 최하단 좌표,오른쪽 최상단 좌표 출력
		System.out.printf("Square (%d,%d)-(%d,%d)\n",left_bottom_x,left_bottom_y,right_top_x,right_top_y);
		
		
	}
	@Override
	public double getArea() {
		return Area;
	}

	@Override
	public double getLength() {
		return Length;
	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}

}
