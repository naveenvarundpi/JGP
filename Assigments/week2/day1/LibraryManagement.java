package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib1=new Library();
		String book = lib1.addBook("Two States");
		System.out.println(book);
		lib1.issueBook();

	}

}
