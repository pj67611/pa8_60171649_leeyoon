//60171649 이윤
public class Text implements Drawable{
	String name;                         //객체의 이름을 저장할 변수생성
	
	public Text() {                      //기본 생성자를 만들어줌
	}
	
	public Text(String ST) {
		this.name = ST;
	}

	public void draw() {
		System.out.println(name);
	}
	
}
