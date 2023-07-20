import java.util.*;

public class Library {

    private Map<Book, Integer> bookAmount;

    // private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.bookAmount = new HashMap<>();
        this.readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (bookAmount.containsKey(book)) {
            this.bookAmount.put(book, (bookAmount.get(book)+1));
        }
    }

    public void addBookWithQuntity(Book book, int howMany) {
        if (bookAmount.containsKey(book)) {
        this.bookAmount.put(book, (bookAmount.get(book)+howMany));
        }
    }

    // TODO
    public List<Book> findBookByTitle(String title) throws BookNotFound {
        List<Book> result = new ArrayList<>();
        for (Book book : bookAmount.keySet()) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBookByGenre(Genre genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookAmount.keySet()) {
            if (book.getGenre() == genre) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBookByAuthor(String AuthorName) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookAmount.keySet()) {
            for (Author author : book.getAuthors()) {
                if (author.getName().contains(AuthorName)) {
                    result.add(book);
                    break;
                }
            }
        }
        return result;
    }


}
