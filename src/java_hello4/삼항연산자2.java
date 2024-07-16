package java_hello4;

public class 삼항연산자2 {

	public static void main(String[] args) {
		int kor = 90;
		int eng = 100;
		int math = 70;
		
		int max;
		
		
		
		max = (eng>math && eng>kor) ? eng : 0;
		max = (math>eng && math>kor) ? math: max;
		max = (kor>math && kor>eng) ? eng: max;
		
		System.out.println(max);
		
		
		max = (kor <= eng)? eng:kor;
		max = (max <= math)? math:max;
		
		
		max= (kor>eng)?(kor>math ? kor:math):(eng > math ? eng: math);
	}
}
