package basic.ex.construct;

public class Book {

    String title;
    String author;
    int page;

    Book(){
        this("", "");
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo() {
        System.out.println("제목  = " + title + "저자 = " + author + "페이지 = " + page);
    }
}
