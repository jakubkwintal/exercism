package gigasecond;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime moment;
    static final int GIGASECOND = 1000_000_000;

    public Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay().plusSeconds(GIGASECOND);
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return moment;
    }
}