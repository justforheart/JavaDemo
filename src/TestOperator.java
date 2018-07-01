public class TestOperator {
	public static void main(String[] args) {
		int a = 10;
		int c = 5;
		
		System.out.println("a = " + Integer.toBinaryString(a));
		System.out.println("c = " + Integer.toBinaryString(c));
		System.out.println("取反运算~a = " + Integer.toBinaryString(~a));
		System.out.println("与运算a&c = " + Integer.toBinaryString(a&c));
		System.out.println("或运算a|c = " + Integer.toBinaryString(a|c));
/*
		if(~b) {
			System.out.println("b为假！");
		}else {
			System.out.println("b为真！");
		}
*/
		System.out.println("异或运算a^c = " + Integer.toBinaryString(a^c));
		a = a << 1;
		System.out.println("a左移一位后：a = " + Integer.toBinaryString(a));
		a = a >> 2;
		System.out.println("a右移二位后：a = " + Integer.toBinaryString(a));
		a = a >>> 1;
		System.out.println("a忽略符号位右移一位后：a = " + Integer.toBinaryString(a));
	}
}