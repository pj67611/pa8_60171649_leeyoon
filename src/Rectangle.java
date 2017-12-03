//60171649 ����
public class Rectangle extends Shape{
	int x1,y1,x2,y2;                                              //(x,y)��ǥ�� ������ ���� ����
	int Area;                                                     //���簢���� ���̸� ������ ���� ����
	int Length;                                                   //���簢���� �ѷ��� ������ ���� ����
	
	public Rectangle() {                                          //�⺻ �����ڸ� �������
	}
	
	public Rectangle(int x1 ,int y1,int x2,int y2) {              //Rectangle�ν��Ͻ��� �����Ҷ� argument�� parameter�� �޴´�.
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
