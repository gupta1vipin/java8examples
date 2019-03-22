package java8.functionalinterfacetest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sampledata.BookPojo;
import sampledata.LibrarySampleData;

public class ComparatorAfterJava8Test {

	public static void main(String[] args) {

		List<BookPojo> personList = LibrarySampleData.prepareSampleData(10);
		
		// Use Lambda instead
		Collections.sort(personList,(BookPojo p1, BookPojo p2) -> p1.getAuthor().getSurname().compareTo(p2.getAuthor().getSurname()));

	}

}
