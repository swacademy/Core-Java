public class GenericsDemo3 {
	public static void main(String[] args) {
		//A Library containing only Books
		Library <Book> myBooks = new Library <Book> ();
		myBooks.addMedia(new Book());
		//myBooks.addMedia(new Video());
		Book lastBook = myBooks.retrieveLast();
	}
}
class Library <Book> {
	private java.util.List <Book> resource = new java.util.ArrayList <Book> ();
	public void addMedia(Book x){
		resource.add(x);
	}
	public Book retrieveLast(){
		int size = resource.size();
		if(size > 0) return resource.get(size -1);
		return null;
	}
}
class Media{}
class Book extends Media{}
class Video extends Media{}
class Newspaper extends Media{}