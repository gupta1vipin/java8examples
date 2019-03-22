package java8.functionalinterfacetest;

@FunctionalInterface
interface HowToCreateFunctionalInterface {

	void someMethod1();
	
	//void someMethod2();
	
	default void defaultBar1() {}  
	
	default void defaultBar2() {}  
		
}
