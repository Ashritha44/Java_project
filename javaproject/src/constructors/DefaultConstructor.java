package constructors;

public class Book {
	int book_id;
	String title;
	String author;
	int price;
	Book(){
		book_id = 101;
		title = THE SUN;
		author = Ashritha;
		price = 100;
	}
public void display() {
	System.out.println("book_id: " + book_id);
	System.out.println("title: " + title);
	System.out.println("author: " + author);
	System.out.println("price: " + price);
	
}
public static void main(String[] args) {
	Book b = new Book();
	b.display();
}
	
}
