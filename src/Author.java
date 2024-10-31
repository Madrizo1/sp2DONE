import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    // Constructor for Author: initializes the author's name.
    public Author(String name) {
        this.name = name;

    }
    // Getter method for 'name' returns the author's name.
    public String getName() {
        return name;
    }
    // Setter method for 'name' allows updating the author's name.
    public void setName(String name) {
        this.name = name;
    }
    // Adds a Title object (book, audiobook, etc.) to the author's list of titles.
    public void addTitle(Title title) {
        titles.add(title);
    }
    // Calculates the total royalty (or pay) by iterating over each Title in 'titles'.
    // Each title's calculateRoyalty() method is called to add its royalty to the total.
    public float calculateTotalPay() {
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        return (float) total;
    }
}