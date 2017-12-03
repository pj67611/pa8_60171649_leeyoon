//60171649 이윤
public class Triangle extends Shape{
	int x;
	int y;
	int bottom;
	int width;
	int left_bottom_x;
	int left_bottom_y;
	int right_bottom_x;
	int right_bottom_y;
	int Area;
	int Length;
	
	public Triangle(int x,int y,int bottom,int width) {
		this.x = x;
		this.y = y;
		this.bottom =bottom;
		this.width = width;
		this.left_bottom_x = x-(bottom/2);
		this.left_bottom_y = y-width;
		this.right_bottom_x = x+(bottom/2);
		this.right_bottom_y = y-width;
		
		this.Area = (bottom*width)/2;
		this.Length = 2*width+bottom;
	}

	@Override
	public void draw() {
		//이등변 삼각형 세 꼭지점 좌표 출력
		System.out.printf("Triangle (%d,%d)-(%d,%d)-(%d,%d)\n",x,y,left_bottom_x,left_bottom_y,right_bottom_x,right_bottom_y);
		
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
