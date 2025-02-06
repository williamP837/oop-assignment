public class Book {
    private String title;
    private String isbn;
    private Author author;

    public Book (String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;

        printTitle();
    }

    public void printTitle(){
        System.out.println("Alice borrowed: " + this.title);
    }

}
