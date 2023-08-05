package beanlifecycle.callByInterface;

public class Book {
String bookName;

public Book(String bookName) {
	System.out.println("Constructor of BookBean called !! ");
}

/**
 * @return the bookName
 */
public String getBookName() {
	return bookName;
}

/**
 * @param bookName the bookName to set
 */
public void setBookName(String bookName) {
	this.bookName = bookName;
}

@Override
public String toString() {
	return "Book [bookName=" + bookName + "]";
}
}
