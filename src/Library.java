class LibraryItem {
    private String title;
    private int yearPublished;

    public LibraryItem(String title, int yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public String toString(){
        return "LibraryItem [ Title : "+ title +", Year Published : "+ yearPublished + " ]";
    }
}

class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String title, int yearPublished, String author, String isbn) {
        super(title, yearPublished);
        this.author = author;
        this.isbn = isbn;
    }

    public String getDetails(){
        return "Book [ " + super.toString() + ", Author : "+ author + ", ISBN : "+ isbn + " ]";
        }
}

class Magazine extends LibraryItem {
    private int issueNumber;
    private String publisher;

    public Magazine(String title, int yearPublished, int issueNumber, String publisher) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    public String getDetails(){
        return "Magazine [ " + super.toString() + ", Issue Number : "+ issueNumber + ", Publisher : "+ publisher + " ]";
        }
}

public class Library{
    public static void main(String[] args) {
        Book book = new Book("Nhat Ky Di Tu", 2019, "Kha Banh", "8386");
        System.out.println(book.getDetails());

        Magazine magazine = new Magazine("100 Buoc Tro Thanh Phu Ho VN", 2023, 1, "Loc FuHo");
        System.out.println(magazine.getDetails());
    }
}

