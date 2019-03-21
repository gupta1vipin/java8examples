package java8.streamapi;

import java.util.ArrayList;
import java.util.List;

public class LibrarySampleData{
	public static List<Book> prepareSampleData(int max) {
		int agebase = 45;
		
		List<Book> library = new ArrayList<>();

		for (int i = 0; i < max; i++) {
			Book book = new Book();
			
			Author author = new Author();
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

class Book {
	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "\n Surname --> "+ this.author.getSurname() + " & Age --> "+ this.author.getAge();
	}
	
	
	
}

class Author { 
	private String firstName;
	private String surname;
	private String gender;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
