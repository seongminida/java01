package java_hello4;

public class Test1 {

	public static void main(String[] args) {
	 double r = 10;
	 final double pi = 3.14;
	 double circle = pi*r*r;
	 System.out.println("반지름:"+ r +" 넓이:" + circle);
	 System.out.println("넓이가 100 미만입니까?");
	 System.out.println(circle<100);
	}

}
