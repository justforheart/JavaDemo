package helloWorld;
/**
 * 测试构造方法
 * @author huangchenfu
 *
 */
public class TestStruction {
	public static void main(String[] args) {
		Poit p1 = new Poit();
		Poit p2 = new Poit();
		p2.setX(3);
		p2.setY(4);
		p2.setZ(5);
		System.out.println("两点距离为："+p1.distance(p2));
		System.out.println(p2.getX()+" "+p2.getY()+" "+p2.getZ());
	}
}

class Poit {
	
	private double x = 0;
	private double y = 0;
	private double z = 0;

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setZ(double z) {
		this.z = z;
	}


	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public Poit() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("点被初始化为；(" + this.x + "," + this.y + "," + this.z + ")");
	}
	
	public double distance(Poit p) {
		
		return Math.sqrt((p.x-this.x)*(p.y-this.y)*(p.z-this.z));		
	}
	
}
