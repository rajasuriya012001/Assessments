import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		double sum1=0;
		int a[]=new int[100];
		int a1[]=new int[100];
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*10);
			a1[i]=(int)(Math.random()*10);
			Circle c= new Circle(a[i]);
			CircleTest c1= new CircleTest(a[i],a1[i]);
			sum=sum+c.getArea();
			sum1=sum1+c1.getArea();
		}


	}
	

}
