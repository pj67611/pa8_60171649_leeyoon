//60171649 이윤
public class Rectangle extends Shape{
	int x1,y1,x2,y2;                                              //(x,y)좌표를 저장할 변수 생성
	int Area;                                                     //직사각형의 넓이를 저장할 변수 생성
	int Length;                                                   //직사각형의 둘레를 저장할 변수 생성
	
	public Rectangle() {                                          //기본 생성자를 만들어줌
	}
	
	public Rectangle(int x1 ,int y1,int x2,int y2) {              //Rectangle인스턴스를 생성할때 argument를 parameter로 받는다.
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		this.Area = Math.abs((x2-x1)*(y2-y1));
		this.Length = Math.abs((x2-x1)*2+(y2-y1)*2);
	}


	public double getArea() {
		return Area;
	}

	public double getLength() {
		return Length;
	}
	
	public void draw() {
		System.out.printf("Rectangle (%d,%d)-(%d,%d)\n",x1,y1,x2,y2);
	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}

}
