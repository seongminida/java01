package java_hello4;

public class SwitchExample {

	public static void main(String[] args) {
		//걸리면 break 까지
		int num = 1;

		switch (num) {
		case 1:
			System.out.println("1 입니다.");
			System.out.println("1 입니다.");
			//break;
		case 2:
			System.out.println("2 입니다.");
			System.out.println("2 입니다.");
			break;
		default:
			System.out.println("디폴트 입니다.");
			System.out.println("디폴트 입니다.");
		}
	}
}
