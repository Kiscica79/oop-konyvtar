import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Reader {
    private String name;
    private String ID;
    private Set<Genre> preferredGenres;

    public Reader(String name, String ID, Set<Genre> preferredGenres) {
        this.name = name;
        this.ID = ID;
        this.preferredGenres = preferredGenres;
    }

    public Reader(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.preferredGenres = new HashSet<>();
    }

    public void addPreferredGenres(Genre genre) {
        preferredGenres.add(genre);
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public Set<Genre> getPreferredGenres() {
        return preferredGenres;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", preferredGenres=" + preferredGenres +
                '}';
    }
}

