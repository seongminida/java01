package java_hello4;

public class if문 {

	public static void main(String[] args) {
	
	int kor = 80;
	int eng = 60;
	int math = 80;
	
	double avg = (kor+eng+math)/3.0;
	
	System.out.println("국어점수: " + kor);
	System.out.println("영어점수: " + eng);
	System.out.println("수학점수: " + math);
	System.out.println("평균점수: " + avg);
	
	if(avg>=90.0) {
		System.out.println("90이상 수 입니다.");
	}
	else if(avg>=80.0) {
		System.out.println("80이상 우 입니다.");
	}
	else if(avg>=70.0) {
		System.out.println("70이상 미 입니다.");
	}
	else if(avg>=60.0) {
		System.out.println("60이상 양 입니다.");
	}
	else{
		System.out.println("50미만 가 입니다.");
	}
	
	
	
	
	}
		
		
		
		
}
