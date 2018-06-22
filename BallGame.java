import java.awt.*;
import javax.swing.*;


public class BallGame extends JFrame {
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 650;	//小球的横坐标
	double y = 100;//小球的纵坐标
	boolean right = true;	//判断桌球的边界
	
	public void paint(Graphics g) {
		System.out.println("画一次窗口");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		if (right) {
			x = x + 1;
		} else {
			x = x - 1;
		}
		
		if (x > 856 - 27 - 40) {
			right = false;
		}
		
		if (x < 33) {
			right = true;
		}
	}

	//窗口加载
	void launchFrame() {
		setSize(856, 500);	//设置窗口的宽高为300
		setLocation(50, 50);	//窗口左上角的坐标为(50, 50)
		setVisible(true);	//显示窗口
		
		//重画窗口
		while (true) {
			repaint();
			try {
				Thread.sleep(40);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("游戏开始了哦");
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
