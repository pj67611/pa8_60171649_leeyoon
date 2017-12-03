//60171649 ����
public class Circle extends Shape {
	int x,y,radius;                                 //���� ����(x,y)��ǥ�� �������� ������ ���� ����
	double Area;                                    //���� ���̸� ������ ���� ����.
	double Length;                                  //���� ���̸� ������ ���� ����.
	
	public Circle() {                               //�⺻ ������ �������
	}

	public Circle(int x,int y,int radius) {         //Circle�ν��Ͻ��� �����Ҷ� argument�� parameter�� �޴´�.
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
