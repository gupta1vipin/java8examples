package sampledata;

public class BookPojo {
	private AuthorPojo author;

	public AuthorPojo getAuthor() {
		return author;
	}

	public void setAuthor(AuthorPojo author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "\n Surname --> "+ this.author.getSurname() + " & Age --> "+ this.author.getAge();
	}
	
	
	
}