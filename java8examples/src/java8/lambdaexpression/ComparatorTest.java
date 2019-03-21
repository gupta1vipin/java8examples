package java8.lambdaexpression;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sampledata.BookPojo;
import sampledata.LibrarySampleData;

public class ComparatorTest {

	public static void main(String[] args) {

		List<BookPojo> personList = LibrarySampleData.prepareSampleData(10);

		// Sort with Inner Class
		Collections.sort(personList, new Comparator<BookPojo>() {
			public int compare(BookPojo p1, BookPojo p2) {
				return p1.getAuthor().getSurname().compareTo(p2.getAuthor().getSurname());
			}
		});

		// Use Lambda instead
		Collections.sort(personList,(BookPojo p1, BookPojo p2) -> p1.getAuthor().getSurname().compareTo(p2.getAuthor().getSurname()));

	}

}
