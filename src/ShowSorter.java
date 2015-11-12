import java.util.*;

/**
 * Created by jmarshall on 11/11/15.
 */
public class ShowSorter {

    private Shows shows;
    private Comparator comparator = new Comparator();
    private List<Show> sorted = new LinkedList<>();

    public ShowSorter(Shows shows) {
        this.shows = shows;
    }

    public void init() {
        boolean unfinished = true;
        List<Show> allShows = shows.getShows();
        while (unfinished) {
            Collections.shuffle(allShows);
            unfinished = compare(allShows.get(0));
        }
    }

    private Show getComparative(Show show) {
        List<Show> otherShows = shows.showsLess(show);
        Shows.shuffleShows(otherShows);
        for (Show s : otherShows) {
            if (!show.inHistory(s)) return s;
        }
        return show;
    }

    private boolean compare(Show show) {
        Show other = getComparative(show);
        if (show.equals(other)) return false;
        int result = comparator.compare(show, other);
        if (result > 0) {
            show.win();
            other.lose();
            return true;
        } else {
            show.lose();
            other.win();
            return true;
        }
    }









}
