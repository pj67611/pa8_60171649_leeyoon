//60171649 ����
public class Text implements Drawable{
	String name;                         //��ü�� �̸��� ������ ��������
	
	public Text() {                      //�⺻ �����ڸ� �������
	}
	
	public Text(String ST) {
		this.name = ST;
	}

	public void draw() {
		System.out.println(name);
	}
	
}
