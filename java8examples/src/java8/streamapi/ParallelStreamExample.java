package java8.streamapi;

import java.util.List;
import java.util.stream.Collectors;

import sampledata.AuthorPojo;
import sampledata.BookPojo;
import sampledata.LibrarySampleData;

public class ParallelStreamExample {

	public static void main(String[] args) {

		List<BookPojo> library = LibrarySampleData.prepareSampleData(50);
		System.out.println("sampleData..." + library);

		long parallelTime = parallelStreamTest(library);
		System.out.println("Parallel Stream (time) : "+ parallelTime);
		
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
		System.out.println("RESULT : "+result);

		
		return endTime-startTime;
	}
	
}
