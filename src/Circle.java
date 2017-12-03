//60171649 이윤
public class Circle extends Shape {
	int x,y,radius;                                 //원의 중점(x,y)좌표와 반지름을 저장할 변수 생성
	double Area;                                    //원의 넓이를 저장할 변수 생성.
	double Length;                                  //원의 넓이를 저장할 변수 생성.
	
	public Circle() {                               //기본 생성자 만들어줌
	}

	public Circle(int x,int y,int radius) {         //Circle인스턴스를 생성할때 argument를 parameter로 받는다.
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.Area = 3.14*radius*radius;
		this.Length = 2*3.14*radius;
	}
	
	public double getArea() {
		return Area;
	}

	public double getLength() {
		return Length;
	}
	
	public void draw() {
		System.out.printf("Circle center(%d,%d)-radius(%d)\n",x,y,radius);
	}

	@Override
	public void move(double dx, double dy) {
		this.x = (int) (x + dx);
		this.y = (int) (y + dy);
		System.out.printf("Cicle (%d,%d)\n",this.x,this.y);
		
	}

}
