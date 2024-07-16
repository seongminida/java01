package java_hello4;

public class 반복문 {

	public static void main(String[] args) {
		int count = 1;
		while (count <= 100) {
			System.out.println(count + "번" + "Hello world");
			count++;
		}
// do while 사용
// 차이 = do while 실행문장을 한번은 실행시킨다.
		count = 1;
		do {
			System.out.println(count + "번" + "Hello world");
			count++;
		} while (count <= 100);

// for문
		for (int i = 0; i < 100; i++) {

			System.out.println(i + "번" + "Hello world");
		}

		// 1부터 100까지의 합
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
			System.out.println(i + ":합:" + sum);

		}
		System.out.println("1부터 100까지의 합: " + sum);

		// 3단 구구단 출력
		int kop = 3;
		for (int a = 1; a < 10; a++) {
			System.out.println(kop + "*" + a + "=" + (kop * a));
		}

		// 출력이 홀수
		for (int a = 1; a <= 100; a++) {
			if (a % 2 == 1) {
				System.out.println(a);
			}
		}
		
		for (int a = 100; a > 0; a = a - 2) {
			System.out.println(a);
		}
		
		sum = 0;
		for (int a = 1; a <= 100; a++) {
			if (a % 3 != 0) {
				sum = sum + a;
				System.out.println(sum);
			}
		}
		int i = 1;
		sum = 0;
		while(i <= 100) {
			if(i%3==0) {
				sum = sum + i;
				System.out.println(sum);
			}
				
			}
			i++;
		}
	
}
