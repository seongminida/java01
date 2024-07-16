//이름 짓는 법
//1.낙타(camel case)표기법(클래스 이름, 변수)
//2.뱀(snake case)표기법(상수 이름)
package java_hello4;

public class 상수연습 {

	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		
		CONST_ASSIGNED = 12;
		
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
	}

}
