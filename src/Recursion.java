/**
 * 测试递归
 * @author hong
 *
 */
public class Recursion {
	public static void main(String[] args) {
		System.out.println(add(10));
	}
	
	static int add(int n) {		
		if (n==1) {
			return 1;
		}else {
			return n + add(n-1);			
		}
	}
}
