package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	public Runnable getRunnable() {
		
		// 지역 내부 클래스 
		int localNum = 100;
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		}
		
		return new MyRunnable();
	}
	
}
public class LocalinnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.getRunnable().run();
	}
}
