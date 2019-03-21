package java8.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class SequentialStreamExample {

	public static void main(String[] args) {

		List<Book> library = LibrarySampleData.prepareSampleData(50);
		//System.out.println("sampleData..." + library);
		
		long sequentialTime = sequentialStreamTest(library);
		System.out.println("Sequential Stream (time) : "+ sequentialTime);

				
		long parallelTime = parallelStreamTest(library);
		System.out.println("Parallel Stream (time) : "+ parallelTime);
		
		System.out.println("%age difference..." + (sequentialTime-parallelTime)*100/sequentialTime + "%");


	}

	private static long sequentialStreamTest(List<Book> library) {
		long startTime = System.nanoTime();
		List<String> result = library.stream()
			.map(book -> book.getAuthor())
			.filter(author -> author.getAge() <= 50)
			.map(Author::getSurname)
			.map(String::toUpperCase)
			.distinct()
			.limit(8)
			.collect(Collectors.toList());
		long endTime = System.nanoTime();
		
		System.out.println("RESULT : "+result);

		return endTime-startTime;
	}

	
	private static long parallelStreamTest(List<Book> library) {
		long startTime = System.nanoTime();

		List<String> result = library.parallelStream()
			.map(book -> book.getAuthor())
			.filter(author -> author.getAge() <= 50)
			.map(Author::getSurname)
			.map(String::toUpperCase)
			.distinct()
			.limit(8)
			.collect(Collectors.toList());
		
		long endTime = System.nanoTime();
		System.out.println("RESULT : "+result);

		
		return endTime-startTime;
	}
	
}