
public class AudioBook extends Title {
    //Duration of the audiobook in minutes
    private int durationInMinutes;

    // Constructor to initialize title, literature type, copies, and duration
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }
    // Getter for duration in minutes
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    // Setter for duration in minutes
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    // Calculate points based on duration, copies, and literature type points
    @Override
    protected double calculatePoints() {
        return durationInMinutes * 0.5 * getCopies() * calculateLiteraturePoints();
    }

    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()) {
            case "BI" -> 1.5;
            case "TE" -> 1.5;
            case "LYRIK" -> 3;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 0.0;
        };
    }
}