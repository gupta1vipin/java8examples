package java8.typeinterfernce;

import java.util.HashMap;
import java.util.Map;

public class Java8TypeInference {

	public static void main(String[] args) {

		
		java5Sample();
		
		java7Sample();
		
		java8Sample();
		

	}
	
	public static void genericMethod(Map<String, Map<String, Object>> map) {
		System.out.println(map);
	}
	

	private static void java5Sample() {
		
		// WORKS.. :)
		Map<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>(); 
		genericMethod(map);
		
		//DOES NOT WORK  :( 
		Map<String, Map<String, Object>> map1 = new HashMap<>();
		genericMethod(new HashMap<>());  
	}
	
	private static void java7Sample(){
		
		// WORKS.. :)
		Map<String, Map<String, Object>> map = new HashMap<>(); 
		
		//DOES NOT WORK  :( 
		genericMethod(new HashMap<>());
	}
	
	
	//JAVA 8
	private static void java8Sample(){
		
		// WORKS.. :)
		genericMethod(new HashMap<>());  
	}


}
