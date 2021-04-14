package lambda;

interface PrintString {
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		// ������ �����ؼ� ����
		PrintString lambdaPrint = str->System.out.println(str);
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}
	// �Ű������� �Ѿ�� ���
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	// ��ȯ������ �ѱ�� ���
	public static PrintString returnPrint() {
		return s->System.out.println(s + " world");
	}

}
