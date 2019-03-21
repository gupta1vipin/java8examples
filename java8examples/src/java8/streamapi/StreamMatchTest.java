package java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamMatchTest {

	public static void main(String[] args) {
		
		matchExample();

	}
	
	private static void matchExample(){
		
		List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
		
	    boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
	    System.out.println("all matches :" + allEven);
	    
	    boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
	    System.out.println("any matches :" + oneEven);
	    
	    boolean noneMatches = intList.stream().noneMatch(i -> i % 2 == 0);
	    System.out.println("none matches :" + noneMatches);
	   
	}

}
