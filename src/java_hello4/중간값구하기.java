package java_hello4;

public class 중간값구하기 {

	public static void main(String[] args) {
		int num1 = 90;
		int num2 = 70;
		int num3 = 100;
		
		if((num2<num1)&&(num1<num3)||(num2>num1)&&(num1>num3))
			System.out.println("중간값은 " +num1+"입니다." );
		else if((num1<num2)&&(num2<num3)||(num2<num1) && (num2>num3))
			System.out.println("중간값은 " +num2+"입니다." );
		else
			System.out.println("중간값은 " + num3 + "입니다.");
	

}
}