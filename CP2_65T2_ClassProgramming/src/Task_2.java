
class Book {

    public String isbn;
    public String title;
    public String type;
    public double price;

    public Book(String isbn, String t, String type, double price) {
        this.isbn = isbn;
        title = t;
        this.type = type;
        this.price = price;
    }
}

public class Task_2 {

    void testConstructor() {
        Book b = new Book("9780134464541",
                "Vulkan Programming Guide", "Programming", 50.78);
        System.out.println(b.isbn);
        System.out.println(b.title);
        System.out.println(b.type);
        System.out.println(b.price);
    }

    public static void main(String[] args) {
        Task_2 tester = new Task_2();
        tester.testConstructor();
    }
}
