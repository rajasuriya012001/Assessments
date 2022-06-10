 
public class Circle{
	double radius;
	double area;
	public static double PI=3.14;
	
	public Circle(double radius) {
		
		this.radius = radius;
	}

	public double getArea() {
		return area= 3.14*radius*radius;
		
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("radius "+radius);
		System.out.println("area "+area);

	}

}
