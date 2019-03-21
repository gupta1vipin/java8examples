package java8.streamapi;

import java.util.List;
import java.util.stream.Collectors;

import sampledata.AuthorPojo;
import sampledata.BookPojo;
import sampledata.LibrarySampleData;

public class StreamComparissionExample {

	public static void main(String[] args) {

		List<BookPojo> library = LibrarySampleData.prepareSampleData(50);
		//System.out.println("sampleData..." + library);
		
		long sequentialTime = sequentialStreamTest(library);
		System.out.println("Sequential Stream (time) : "+ sequentialTime);
		
		long parallelTime = sequentialStreamTest(library);
		System.out.println("parallelTime Stream (time) : "+ parallelTime);
		
		System.out.println("%age difference : "+ (sequentialTime-parallelTime)*100/sequentialTime);


	}

	private static long sequentialStreamTest(List<BookPojo> library) {
		long startTime = System.nanoTime();
		List<String> result = library.stream()
			.map(book -> book.getAuthor())
			.filter(author -> author.getAge() <= 50)
			.map(AuthorPojo::getSurname)
			.map(String::toUpperCase)
			.distinct()
			.limit(8)
			.collect(Collectors.toList());
		long endTime = System.nanoTime();
		
		//System.out.println("RESULT : "+result);

		return endTime-startTime;
	}
	
	
	private static long parallelStreamTest(List<BookPojo> library) {
		long startTime = System.nanoTime();

		List<String> result = library.parallelStream()
			.map(book -> book.getAuthor())
			.filter(author -> author.getAge() <= 50)
			.map(AuthorPojo::getSurname)
			.map(String::toUpperCase)
			.distinct()
			.limit(8)
			.collect(Collectors.toList());
		
		long endTime = System.nanoTime();
		//System.out.println("RESULT : "+result);

		
		return endTime-startTime;
	}


}
