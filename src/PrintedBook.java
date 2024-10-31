public class PrintedBook extends Title {
    //Number of pages in the printed book
    private int pages;
    // Constructor to initialize title, literature type, copies, and pages
    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    // Getter
    public int getPages() {
        return pages;
    }
    //Setter
    public void setPages(int pages) {
        this.pages = pages;
    }
    //Calculate the points based on the number of pages, copies and literature type
    @Override
    protected double calculatePoints() {
        return pages * getCopies() * calculateLiteraturePoints();
    }
    // Determine literature points based on the type of literature
    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()){
            case "BI" -> 3;
            case "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0.0;
        };

    }
}