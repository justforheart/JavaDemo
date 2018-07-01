/**
 * 测试方法调用
 * @author hong
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		int c = 0;
		
		//通过对象调用方法
		TestMethod tm = new TestMethod();
		tm.MyPrint();	//调用无参方法
		c = tm.MyAdd(4, 5, 6);	//调用有参方法。 用 c 存储返回的结果
		System.out.println(c);
		c = tm.MyAdd(12, 432);
		System.out.println(c);
	}
	
	// 定义一个无参的方法
	void MyPrint() {
		System.out.println("我要打印一行字。");
	}
	
	// 定义一个有参的方法，返回一个int类型的变量
	int MyAdd(int a, int b, int c) {
		int sum = 0;
		sum = a + b + c;
		
		return sum;
	}
	
	// 方法的重载（MyAdd）
	int MyAdd(int a, int b) {
		int sum = 0;
		sum = a + b;
		
		return sum;
	}
}
