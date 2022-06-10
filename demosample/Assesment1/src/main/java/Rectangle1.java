
public class Rectangle1 {

	int b;
	int h;
	double area;
	public Rectangle1(int b,int h) {
		this.b=b;
		this.h=h;
	}
	public void Calculate()
	{
		area=(b*h)/2;
	}
	public void display() {
		System.out.println("area  "+area);
	}
}
