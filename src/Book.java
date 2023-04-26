import java.util.Scanner;
public class Book {
	int id;
	String name;

	public static void main(String[] args) {
		Book b= new Book();
		Scanner s= new Scanner(System.in);
		System.out.println("enter the book id ");
		b.id=s.nextInt();
		System.out.println("enter the book name");
		b.name=s.next();
		System.out.println(b.id);
		System.out.println(b.name);
		s.close();


	}


}
