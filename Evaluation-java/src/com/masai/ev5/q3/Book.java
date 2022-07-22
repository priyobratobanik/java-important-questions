package com.masai.ev5.q3;

import java.util.HashSet;
import java.util.Objects;

public class Book {

	private int id;
    private String bookName;
    private String author;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Book(int id, String bookName, String author) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bookName, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bookName, other.bookName) && id == other.id;
	}
	
}


	 class Main{
		 
		 public static void main(String[] args) {
			
			 
			 HashSet<Book> hb= new HashSet<Book>();
			 
			    hb.add(new Book(1,"Name1","Author1"));
	            hb.add(new Book(2,"Name2","Author1"));
	            hb.add(new Book(3,"Name1","Author1"));
	            hb.add(new Book(1,"Name1","Author2"));
	            


	            System.out.println(hb.toString());
			 
			 
		}
	 }
