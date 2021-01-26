import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Deadlines are Tasks that must be completed before a certain date.
 */
public class Deadline extends Task {

    protected LocalDate by;

    public Deadline(String description, LocalDate by) {
        super(description);
        this.by = by;
    }

    /**
     * Creates a string representation of the Event object.
     * @return a string representation of the Event.
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}
