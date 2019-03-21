package java8.lambdaexpression;

public class RunnableTest {

	public static void main(String[] args) {

		beforeJava8();
		
		withJava8();
	}

	private static void beforeJava8() {
		// Anonymous Runnable
		Runnable r1 = new Runnable(){
			@Override
			public void run(){
				System.out.println("Hello world one!");
			}
		};
		r1.run();
	}
	
	

	private static void withJava8() {
		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Hello world two!");
		r2.run();
	}

}
