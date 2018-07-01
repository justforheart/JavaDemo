import java.util.Scanner;

/**
 * 测试Scanner
 * @author hong
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的名字：");
		String name = scanner.nextLine();
		System.out.println("你的名字是：" + name);
	}
}
