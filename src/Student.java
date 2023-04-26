import java.util.Scanner;
public class Student {
	int rollno;
	String name;
	static  String collgna;
	public static void main (String[] args) {
		Student e= new Student();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the roolnum");
		e.rollno=s.nextInt();
		System.out.println("enter the name");
		e.name=s.next();
		System.out.println("enter the colllage name");
		collgna=s.next();
		System.out.println(e.rollno);
		System.out.println(e.name);
		System.out.println(collgna);
		s.close();

		
	}
	

}
