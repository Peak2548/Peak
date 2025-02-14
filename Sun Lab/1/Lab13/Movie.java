public class Movie {
    String title;
    int releasedYear;
    double rating;
    Movie(String title, int releasedYear, double rating) {
        this.title = title;
        this.releasedYear = releasedYear;
        this.rating = rating;
    }
    String getTitle() {
        return title;
    }
    int getReleasedYear() {
        return releasedYear;
    }
    double getRating() {
        return rating;
    }
    @Override
    public String toString () {
        return getTitle() + "(" + getReleasedYear() + ", " + getRating() + ")";
    }
}