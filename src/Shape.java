//60171649 이윤
public abstract class Shape implements Drawable,Movable{

	public abstract double getArea();            //하위 클래스에서 getArea 메소드의 구체적인 로직을 만들도록 강제함.
	
	public abstract double getLength();          //하위 클래스에서 getLength 메소드의 구체적인 로직을 만들도록 강제함.
	
}
