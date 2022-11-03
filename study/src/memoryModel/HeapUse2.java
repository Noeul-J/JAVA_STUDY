package memoryModel;

class Bookk{
	String title;
}

public class HeapUse2 {

	public static void main(String[] args) {
		Bookk book1 = new Bookk();
		book1.title = "자바 클래스 기초";
		
		Bookk book2 = book1;

		System.out.println(book1.title);
		System.out.println(book2.title);
		System.out.println("-----------------------");
		
		book2.title= "자바 디자인 패턴";
		System.out.println(book1.title);
		System.out.println(book2.title);
		
	}

}
