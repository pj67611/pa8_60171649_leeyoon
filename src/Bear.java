//60171649 이윤
public class Bear extends Shape{
	int left_bottom_x;
	int left_bottom_y;
	int right_top_x;
	int right_top_y;
	int circle_radius;
	int left_circle_center_x;
	int left_circle_center_y;

	
	
	public 	Bear(int x,int y,int radius) {
		this.left_bottom_x = x - radius;
		this.left_bottom_y = y - radius;
		this.right_top_x = x + radius;
		this.right_top_y = y + radius;
		this.left_circle_center_x = x - radius;
		this.left_circle_center_y = y + radius;
		this.circle_radius = radius/2;
	}

	public void draw() {
		System.out.println("Bear");
		//직사각형 왼쪽최하단 좌표,오른쪽최상단좌표 출력
		System.out.printf("Rectangle (%d,%d)-(%d,%d)\n",this.left_bottom_x,this.left_bottom_y,this.right_top_x,this.right_top_y);
		//왼쪽 원 중심좌표출력
		System.out.printf("Circle center(%d,%d)-radius(%d)\n",this.left_circle_center_x,this.left_circle_center_y,circle_radius);
		//오른쪽 원 중심좌표출력
		System.out.printf("Circle center(%d,%d)-radius(%d)\n",this.right_top_x,this.right_top_y,circle_radius);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}

}
