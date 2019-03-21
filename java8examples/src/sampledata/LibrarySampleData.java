package sampledata;

import java.util.ArrayList;
import java.util.List;

public class LibrarySampleData{
	public static List<BookPojo> prepareSampleData(int max) {
		int agebase = 45;
		
		List<BookPojo> library = new ArrayList<>();

		for (int i = 0; i < max; i++) {
			BookPojo book = new BookPojo();
			
			AuthorPojo author = new AuthorPojo();
			author.setFirstName("FirstName:" + i);
			author.setSurname("Surname:" + i);
			author.setAge(agebase + i);
			author.setGender("Gender:" + i);
			agebase++;
			
			book.setAuthor(author);

			library.add(book);
		}
		
		//System.out.println(library);
		return library;
	}
}
