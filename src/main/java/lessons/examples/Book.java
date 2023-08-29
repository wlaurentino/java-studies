package lessons.examples;

public class Book {

    String title;
    String author;
    int numberOfPages;

    public Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.numberOfPages = 0;
    }

    public Book(String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String toString(){
        return ("Title " + title + " Author " + author + " Number of Pages " + numberOfPages);
    }

    public static void main(String[] args){

        Book defaultBook = new Book();
        Book parametizedBook = new Book("The Count of Monte Cristo", "Alexander Dumas", 958);

        System.out.println(defaultBook);
        System.out.println(parametizedBook);

    }


}
