
public class Square extends Rectangle1{
	public Square(int b,int h) {
		super(h, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square(4,8);
		s.Calculate();
		s.display();
	}

}
