import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {

    private static final LocalDate OPENING_DATE = LocalDate.of(2012, 9, 15); 

    private static final DateTimeFormatter INPUT_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

    private static final DateTimeFormatter DESCRIPTION_FORMATTER = DateTimeFormatter.ofPattern("'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a.", Locale.US);
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, INPUT_FORMATTER);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return (hour >= 12 && hour < 18);
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return DESCRIPTION_FORMATTER.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        return OPENING_DATE.withYear(LocalDate.now().getYear());
    }
}
