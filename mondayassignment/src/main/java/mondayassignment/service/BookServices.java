package mondayassignment.service;
	import java.util.List;

import mondayassignment.dao.BookDao;
import mondayassignment.entities.Book;
	 
	 
	public class BookServices {
	 
	    private static BookDao bookDao;
	 
	    public void BookService() {
	        bookDao = new BookDao();
	    }
	 
	    public void persist(Book entity) {
	        bookDao.openCurrentSessionwithTransaction();
	        bookDao.persist(entity);
	        bookDao.closeCurrentSessionwithTransaction();
	    }
	 
	    public void update(Book entity) {
	        bookDao.openCurrentSessionwithTransaction();
	        bookDao.update(entity);
	        bookDao.closeCurrentSessionwithTransaction();
	    }
	 
	    public Book findById(String id) {
	        bookDao.openCurrentSession();
	        Book book = bookDao.findById(id);
	        bookDao.closeCurrentSession();
	        return book;
	    }
	 
	    public void delete(String id) {
	        bookDao.openCurrentSessionwithTransaction();
	        Book book = bookDao.findById(id);
	        bookDao.delete(book);
	        bookDao.closeCurrentSessionwithTransaction();
	    }
	 
	    public List<Book> findAll() {
	        bookDao.openCurrentSession();
	        List<Book> books = bookDao.findAll();
	        bookDao.closeCurrentSession();
	        return books;
	    }
	 
	    public void deleteAll() {
	        bookDao.openCurrentSessionwithTransaction();
	        bookDao.deleteAll();
	        bookDao.closeCurrentSessionwithTransaction();
	    }
	 
	    public BookDao bookDao() {
	        return bookDao;
	    }
	}


