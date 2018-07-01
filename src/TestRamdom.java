/**
 * 测试随机值
 * @author hong
 *
 */
public class TestRamdom {
	public static void main(String[] args) {
		double r = Math.random();
		System.out.println(r);
		int a = (int)(r * 10) + 1;
		
		System.out.println(a);
		if (a > 3) {
			System.out.println("运气不错");
		}else {
			System.out.println("点数小");
		}
	}
}