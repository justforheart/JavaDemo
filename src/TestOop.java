import java.util.Scanner;	//Scanner类所需
/***
 * 测试对象
 * @author hong
 *
 */
public class TestOop {
	public static void main(String[] args) {
		Student st = new Student();	//构造对象
//		st.age = 25;
//		st.id = 405;
//		st.name = "黄陈富";
		Scanner scanner = new Scanner(System.in);	// 创建一个可以接受键盘输入的对象
		// 利用输入的值赋值给对象的变量
		System.out.println("年龄：");
		st.age = scanner.nextInt();
		System.out.println("名字：");
		st.name = scanner.next();
		System.out.println("号码：");
		st.id = scanner.nextInt();
		st.info();
		st.sleep();
		st.eat();
	}
}
class Student {
	int age;
	String name;
	int id;
	
	public Student() {	//构造函数，在对象被初始化时执行
		// TODO Auto-generated constructor stub
		System.out.println("我被构造了");
	}
	
	void sleep() {	// 类方法，可以被对象调用
		System.out.println("我睡觉了");
	}
	
	void eat() {
		System.out.println("我吃我吃我吃");
	}
	
	void info() {
		System.out.println("我叫" + this.name + ", 今年" + this.age + "岁,id是" + this.id);
	}
}