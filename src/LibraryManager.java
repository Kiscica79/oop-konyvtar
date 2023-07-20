import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LibraryManager {

    private static List<Book> books;


    public List<Book> findBookByTitle(String title) {
        return null;
    }

    public static void main(String[] args) {
        Book konyv = new Book("1984", 1949, Genre.HISTORICAL_NOVELLA, List.of(new Author("Orwell")));
        Book masikKonyv = new Book("Migránsok", 2018, Genre.DRAMA,
                List.of(new Author("Orwell"), new Author("Soros György")));
        System.out.println(konyv);

        Reader olvaso = new Reader("Andris", "ADD112", new HashSet<>(Arrays.asList(Genre.HORROR)));
        olvaso.addPreferredGenres(Genre.DRAMA);
        System.out.println(olvaso);

        Reader olvaso2 = new Reader("Béla", "DFD2222");
        olvaso2.addPreferredGenres(Genre.SC_FI);
        System.out.println(olvaso2);

    }
}
