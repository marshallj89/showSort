import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jmarshall on 11/11/15.
 */
public class Shows {
    private List<Show> shows = new ArrayList<Show>();

    public Shows(List<Show> shows) {
        this.shows = shows;
    }

    public List<Show> getShows() {
        return shows;
    }

    public List<Show> showsLess(Show show) {
        if (!shows.contains(show)) return shows;
        List<Show> temp = new ArrayList<>();
        for (Show s : shows) {
            if (!show.equals(s)) temp.add(s);
        }
        return temp;
    }

    public List<Show> shuffleShows() {
        return shuffleShows(this.shows);
    }

    public static List<Show> shuffleShows(List<Show> shows) {
        Collections.shuffle(shows);
        return shows;
    }


}
