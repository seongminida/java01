package java_hello4;

public class 연산자5 {

	public static void main(String[] args) {
		byte n1 = 5;
		byte n2 = 3;
		byte n3 = -1;
		
		byte r1 = (byte)(n1&n2);
		byte r2 = (byte)(n1|n2);
		byte r3 = (byte)(n1 ^ n2);
		byte r4 = (byte)(~n3);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
}
}