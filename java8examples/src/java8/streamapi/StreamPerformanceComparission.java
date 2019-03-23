package java8.streamapi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import sampledata.AuthorPojo;
import sampledata.BookPojo;
import sampledata.LibrarySampleData;

public class StreamPerformanceComparission {

	public static void main(String[] args) {

		List<BookPojo> library = LibrarySampleData.prepareSampleData(500000);
		//System.out.println(" Sample Data... \n" + library);
		
		// Without Java 8 Syntax
		long startTime = System.nanoTime();
		Set<String> streamResult = beforeJava8Programming(library);
		long endTime = System.nanoTime();
		System.out.println("\n RESULT - WithoutJava8 Syntex : \n"+ streamResult);
		long beforeJava8 = endTime-startTime;
		System.out.println("---Time Taken By Java 7 syntax---" + (beforeJava8));

		//  Java 8 Syntax - Stream
		long startTimeJava8 = System.nanoTime();
		Set<String> streamResultJava8 = beforeJava8Programming(library);
		long endTimeJava8 = System.nanoTime();
		System.out.println("\n RESULT - WithJava8 Stream : \n"+ streamResultJava8);
		long afterJava8 = endTimeJava8-startTimeJava8;
		System.out.println("---Time Taken By Java 8 Stream---" + (afterJava8));
		
		System.out.println("\n ******%age improvement : "+ (beforeJava8-afterJava8)*100/beforeJava8);
		
		//  Java 8 Syntax - Parallel Stream
		long startTimeParalleStreamJ8 = System.nanoTime();
		Set<String> streamResultParallelStreamJ8 = beforeJava8Programming(library);
		long endTimeParallelStreamJ8 = System.nanoTime();
		System.out.println("\n RESULT : \n"+ streamResultParallelStreamJ8);
		long timeDiffWithParallelStreamJ8 = endTimeParallelStreamJ8-startTimeParalleStreamJ8;
		System.out.println("---Time Taken By Java 8 syntax---" + (timeDiffWithParallelStreamJ8));
		
		System.out.println("\n ******%age improvement : "+ (beforeJava8-timeDiffWithParallelStreamJ8)*100/beforeJava8);
	}

	
	private static Set<String> beforeJava8Programming(List<BookPojo> library){
		
		Set<String> authorSurnames = new HashSet<>();
		if(!library.isEmpty()){
			int i = 0; //maxcount
			for (BookPojo bookPojo : library) {
				AuthorPojo author = bookPojo.getAuthor();
				if(author!=null && author.getAge() <=50 && i<8){
					authorSurnames.add(author.getSurname().toUpperCase());
					i++;
				}
			}
		}
		return authorSurnames;
	}

	private static Set<String> java8StreamTest(List<BookPojo> library) {
		return library!=null? library.stream()
			.map(book -> book.getAuthor())
			.filter(author -> author.getAge() <= 50)
			.map(AuthorPojo::getSurname)
			.map(String::toUpperCase)
			.distinct()
			.limit(8)
			.collect(Collectors.toSet()) : new HashSet<>();
	}
	
	private static Set<String> java8ParallelStreamTest(List<BookPojo> library) {
		return library!=null? library.parallelStream()
			.map(book -> book.getAuthor())
			.filter(author -> author.getAge() <= 50)
			.map(AuthorPojo::getSurname)
			.map(String::toUpperCase)
			.distinct()
			.limit(8)
			.collect(Collectors.toSet()) : new HashSet<>();
	}

}
