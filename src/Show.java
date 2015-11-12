/**
 * Created by jmarshall on 11/11/15.
 */
public class Show {
    private String title;
    private String description;
    private int points;

    public Show(String title, String description) {
        this.title = title;
        this.description = description;
        this.points = 0;
    }

    public Show(String title) {
        this(title, "No description provided");
    }

    public void win() {
        points += Constants.INCREASE;
    }

    public void lose() {
        points -= Constants.DECREASE;
    }

//    getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPoints() {
        return points;
    }
}
