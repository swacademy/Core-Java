public class GenericsDemo2 {
	public static void main(String[] args) {
		//A Library containing only Books
		Library myBooks = new Library();
		myBooks.addMedia(new Book());
		myBooks.addMedia(new Video());
		Book lastBook = (Book)myBooks.retrieveLast();
	}
}
class Library{
	private java.util.List resource = new java.util.ArrayList();
	public void addMedia(Media x){
		resource.add(x);
	}
	public Media retrieveLast(){
		int size = resource.size();
		if(size > 0) return (Media)resource.get(size -1);
		return null;
	}
}
class Media{}
class Book extends Media{}
class Video extends Media{}
class Newspaper extends Media{}