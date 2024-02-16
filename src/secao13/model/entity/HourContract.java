package secao13.model.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HourContract {

    private Long id;

    private LocalDate dateTime;

    private Double valuePerHour;

    private Integer hours;

    public HourContract(LocalDate dateTime, Double valuePerHour, Integer hours){
        this.dateTime = dateTime;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    public HourContract(Long id, LocalDate dateTime, Double valuePerHour, Integer hours){
        this.id = id;
        this.dateTime = dateTime;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Long getId(){
        return id;
    }

    public LocalDate getDateTime(){
        return dateTime;
    }

    public void setDateTime(LocalDate newDateTime){
        this.dateTime = newDateTime;
    }

    public Double getValuePerHour(){
        return valuePerHour;
    }

    public void setValuePerHour(Double newValuePerHour){
        this.valuePerHour = newValuePerHour;
    }

    public Integer getHours(){
        return hours;
    }

    public void setHours(Integer newHours){
        this.hours = newHours;
    }

    public Double totalValue(){
        return valuePerHour * hours;
    }

}
