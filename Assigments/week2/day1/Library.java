package week2.day1;

public class Library {

		public String addBook(String bookTitle)
		{
			System.out.println("Book added successfully");
			return bookTitle;
		}
		public void issueBook()
		{
			System.out.println("Book issued successfully");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib=new Library();
		String book = lib.addBook("The power of money");
		System.out.println(book);
		lib.issueBook();
	}

}
