import java.util.*;

/**
 * Created by jmarshall on 11/11/15.
 */
public class ShowSorter {

    private Shows shows;
    private Comparator comparator = new Comparator();

    public ShowSorter(Shows shows) {
        this.shows = shows;
    }

    public void init() {
        
    }


    public Show getComparative(Show show) {
        List<Show> otherShows = shows.showsLess(show);
        Shows.shuffleShows(otherShows);
        for (Show s : otherShows) {
            if (!show.inHistory(s)) return s;
        }
        return show;
    }

    public boolean compare(Show show) {
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
