package java_hello4;

public class 연산자6 {

	public static void main(String[] args) {
		byte num;
		
		num = 2;
		System.out.print((byte)(num << 1) + " ");
		System.out.print((byte)(num << 2) + " ");
		System.out.print((byte)(num << 3) + " " + '\n');
		
		num = 8;
		System.out.print((byte)(num >> 1) + " ") ;
		System.out.print((byte)(num >> 2) + " ") ;
		System.out.print((byte)(num >> 3) + " " + '\n') ;
		
		num = -8;
		System.out.print((byte)(num >> 1) + " ");
		System.out.print((byte)(num >> 2) + " ");
		System.out.print((byte)(num >> 3) + " "+ '\n');
}
}