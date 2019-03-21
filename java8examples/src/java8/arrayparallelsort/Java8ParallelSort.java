package java8.arrayparallelsort;

import java.util.Arrays;
import java.util.Random;

public class Java8ParallelSort {

	public static void main(String[] args) {		
		
       long normal = performNormalSort();
       System.out.println("Time Taken by normal sort : "+normal);
       
       //-------normalSort
       long parallel = performParallelSort();
       System.out.println("Time Taken by parallel sort : "+parallel);

       System.out.println("\n %age difference : " + (normal-parallel)*100/normal + "%");
       
	}
	
	private static long performNormalSort() {
		int[] numbers = generateRandomArray();
		long startTime = System.nanoTime();
		
        Arrays.sort(numbers);
        
        long endTime = System.nanoTime();
        return (endTime-startTime);
        
	}

	private static long performParallelSort() {
		int[] numbers = generateRandomArray();
		long startTime = System.nanoTime();
		
		//-------parallelSort
        Arrays.parallelSort(numbers);
        
        long endTime = System.nanoTime();
        return (endTime-startTime);
	}

	private static int[] generateRandomArray() {
		int arraySize = 1000;
        int numbers[] = new int[arraySize];  
        Random rand = new Random();  
        for (int i = 0; i < 1000; i++) {  
        	numbers[i]=rand.nextInt();
        }
        return numbers;
	}


}
