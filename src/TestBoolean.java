public class TestBoolean {
	public static void main(String[] args) {
		boolean whether = true;
		boolean done = false;
		
		if(whether && !done) {	//不要写成 if(whether==true && done!=true) // less is more.
			System.out.println("判断未完成！");
		}else {
			System.out.println("未知结果！");
		}
	}
}