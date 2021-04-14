package lambda;

interface PrintString {
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		// 변수에 대입해서 구현
		PrintString lambdaPrint = str->System.out.println(str);
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}
	// 매개변수로 넘어가는 방법
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	// 반환값으로 넘기는 방법
	public static PrintString returnPrint() {
		return s->System.out.println(s + " world");
	}

}
