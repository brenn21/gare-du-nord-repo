package com.garedunord.ticketservice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="ticket")
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String passengerType;
    private String ticketType;
    private String cityDestination;
    private String cityCurrent;
    private String classTicket;
    private int ticketNumber;
    private double price;
    private Date dateValid;

    public Ticket(String passengerType, String ticketType,
                  String cityDestination, String cityCurrent,
                  String classTicket, int ticketNumber,
                  double price, Date dateValid) {
        this.passengerType = passengerType;
        this.ticketType = ticketType;
        this.cityDestination = cityDestination;
        this.cityCurrent = cityCurrent;
        this.classTicket = classTicket;
        this.ticketNumber = ticketNumber;
        this.price = price;
        this.dateValid = dateValid;
    }

    public Ticket(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getCityDestination() {
        return cityDestination;
    }

    public void setCityDestination(String cityDestination) {
        this.cityDestination = cityDestination;
    }

    public String getCityCurrent() {
        return cityCurrent;
    }

    public void setCityCurrent(String cityCurrent) {
        this.cityCurrent = cityCurrent;
    }

    public String getClassTicket() {
        return classTicket;
    }

    public void setClassTicket(String classTicket) {
        this.classTicket = classTicket;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateValid() {
        return dateValid;
    }

    public void setDateValid(Date dateValid) {
        this.dateValid = dateValid;
    }

}
