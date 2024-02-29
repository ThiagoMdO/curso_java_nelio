package secao19.model.entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

public class LogEntry {

    private String userName;

    private Instant moment;

    public LogEntry(String userName, Instant moment){
        this.userName = userName;
        this.moment = moment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Instant getMoment() {
        return moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }
}
