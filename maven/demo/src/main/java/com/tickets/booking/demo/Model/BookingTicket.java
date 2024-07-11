package com.tickets.booking.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Booking_Ticket")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookingTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    private String passengerName;
    private String busRoute;
    private String bookingDate;
    private String time;
    private int seatNumber;
    private String selectBus;
  
}
