package secao15.model.entities;

import secao15.model.exception.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation01 {

    private Integer roomNumber;

    private LocalDate checkIn;

    private LocalDate checkOut;

    public Reservation01() {
    }

    public Reservation01(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        if (checkIn.compareTo(LocalDate.now()) <= 0 || checkOut.compareTo(LocalDate.now()) <= 0) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (checkOut.compareTo(checkIn) <= 0){
            throw new DomainException("Check-out date must be after check-in date");
        }
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
        Duration t1 = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
        return t1.toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {
        if (checkIn.compareTo(LocalDate.now()) <= 0 || checkOut.compareTo(LocalDate.now()) <= 0) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (checkOut.compareTo(checkIn) <= 0){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Long t1 = duration();
        String period;
        if (t1 == 1) {
            period = "Night";
        } else {
            period = "Nights";
        }
        sb.append("Reservation: ");
        sb.append("Romm " + roomNumber);
        sb.append(", check-in: " + checkIn.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        sb.append(", check-out: " + checkOut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        sb.append(", " + t1 + " " + period);

        return sb.toString();
    }
}
