package secao15.model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private Integer roomNumber;

    private LocalDate checkIn;

    private LocalDate checkOut;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public Long duration() {
        Duration period = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
        return period.toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        Duration t1 = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
        StringBuilder sb = new StringBuilder();
        String period;
        if(t1.toDays() == 1){
            period = " night";
        }else{
            period = " nights";
        }
        sb.append("Reservation: ");
        sb.append("Room " + roomNumber);
        sb.append(", check-in: " + checkIn.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        sb.append(", check-out: " + checkOut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        sb.append(", " + t1.toDays() + period);
        return sb.toString();
    }
}
