package Chapter5.Homework1;

public class Demo {

	public static void main(String[] args) {
		Book book1 = new Book("Don�t make me think","Steve Krung",2000);
		book1.borrow();
		System.out.println(book1);
		
		Book book2 = new Book("Pro Java Programming","Mark Summerfield",2005);
		book2.returnBack();
		System.out.println(book2);
		
		Book book3 = new Book("Programming in Python 3","Terrill",2005);
		book3.borrow();
		System.out.println(book3);
		
		Book book4 = new Book("The Clean Coder","Robert",2011);
		book4.borrow();
		System.out.println(book4);
		
		Book book5 = new Book("The Art of Agile Development","James Shore",2007);
		book5.returnBack();
		System.out.println(book5);
		
		Book book6 = new Book("Head First Design Patterns","Eric Freeman",2004);
		book6.returnBack();
		System.out.println(book6);
		
		Book book7 = new Book("The Linux Command Line","Willian",2009);
		book7.borrow();
		System.out.println(book7);
		
		Book book8 = new Book("Code Complete","Steve",1993);
		book8.returnBack();
		System.out.println(book8);
		
		Book book9 = new Book("Unit Test Patterns","Gerard Meszaros",2003);
		book9.returnBack();
		System.out.println(book9);
		
		Book book10 = new Book("The C++ Programming Language","Bjarne Stroustup",2013);
		book10.borrow();
		System.out.println(book10);
		
		//create the student object and test student methods here
		
	}

}
