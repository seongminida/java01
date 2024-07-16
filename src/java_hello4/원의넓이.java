package java_hello4;

public class 원의넓이 {

	public static void main(String[] args) {
		double r =10;
		final double pi = 3.14;
		double Area = pi*r*r;
		
		System.out.println("반지름:" + r + " " + "넓이:" + Area);
		System.out.println("넓이가 100 미만입니까?");
		System.out.println(Area<100);
		
	}

}
