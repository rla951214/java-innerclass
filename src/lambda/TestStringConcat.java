package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		//인터페이스 구현
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		//람다식 구현
		StringConcat concat = (s1, s2)-> System.out.println(s1 + " " +s2);
		concat.makeString("hello", "java");
		
		//익명 내부클래스 구현
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
			
		};
		concat2.makeString("hello", "java");
	}

}
