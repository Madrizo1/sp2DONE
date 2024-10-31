public abstract class Title {

    //Title, literature type, number of copies, and royalty rate
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;
   // Constructor to initialize title, literature type, and copies
    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }
    // Getter and setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    // Getter and setter for literature type
    public String getLiteratureType() {
        return literatureType;
    }

    public void setLiteratureType(String literatureType) {
        this.literatureType = literatureType;
    }
    // Getter and setter for copies
    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
    // Getter and setter for royalty rate
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    // Calculates the total royalty based on points and rate
    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();


    protected abstract double calculateLiteraturePoints();

}
