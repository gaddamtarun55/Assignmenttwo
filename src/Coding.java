import java.util.Scanner;
public class Coding {
	int a;
	static String b;
	double c;
	public static void main (String [] args ) {
		Coding d = new Coding();
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		d.a = s.nextInt();
		System.out.println("enter the name number");
		b = s.next();
		System.out.println("enter the decimal value");
		d.c=s.nextDouble();
		
		System.out.println(d.a);
		System.out.println(b);
		System.out.println(d.c);
		s.close();
		
	
		
		
	}
	

}
