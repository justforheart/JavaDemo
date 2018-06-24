public class TestOperator {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a = " + Integer.toBinaryString(a));
		a = a << 1;
		System.out.println("a左移一位后：a = " + Integer.toBinaryString(a));
		a = a >> 2;
		System.out.println("a右移二位后：a = " + Integer.toBinaryString(a));
		a = a >>> 1;
		System.out.println("a忽略符号位右移一位后：a = " + Integer.toBinaryString(a));
	}
}
