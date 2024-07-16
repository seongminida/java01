package java_hello4;

public class 타이머 {

	public static void main(String[] args) {
		int kor = 90;
		int eng = 77;
		int math = 88;
		
		if((kor<math)&&(math>eng)) {
			System.out.println("최대값: "+ math);
		}
		
		if((kor>math)&&(kor>eng)) {
			System.out.println("최대값: " + kor);
			
		}
		
		else {
			System.out.println("최대값 :" + eng);
		}
		
		
		

		
	}
}
