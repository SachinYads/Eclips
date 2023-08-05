package beanlifecycle.Bean;

public class BookBean {
 private String bookName;

public BookBean() {
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
	return "BookBean [bookName=" + bookName + "]";
}
}
