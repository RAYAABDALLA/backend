package com.tickets.booking.demo.Controler;

import com.tickets.booking.demo.Model.BookingTicket;
import com.tickets.booking.demo.Services.BookingTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/BookingTtickets")
public class BookingController {

    @Autowired
    private BookingTicketService bookingTicketService;

    @PostMapping
    public ResponseEntity<BookingTicket> createBooking(@RequestBody BookingTicket bookingTicket) {
        BookingTicket savedBookingTicket = bookingTicketService.createBookingTicket(bookingTicket);
        return new ResponseEntity<>(savedBookingTicket, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BookingTicket>> getAllBookingTickets() {
        List<BookingTicket> bookingTickets = bookingTicketService.getAllBookingTicket();
        return new ResponseEntity<>(bookingTickets, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingTicket> getBookingTicketById(@PathVariable("id") Long bookingTicketId) {
        BookingTicket savedBooking = bookingTicketService.getBookingTicketById(bookingTicketId);
        return new ResponseEntity<>(savedBooking, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBookingTicket(@PathVariable("id") Long bookingTicketId) {
        bookingTicketService.deleteBookingTicket(bookingTicketId);
        return new ResponseEntity<>("BookingTicket deleted successfully", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookingTicket> updateBookingTicket(@PathVariable("id") Long bookingTicketId, @RequestBody BookingTicket bookingTicket) {
        BookingTicket updatedBookingTicket = bookingTicketService.updateBookingTicket(bookingTicketId, bookingTicket);
        return new ResponseEntity<>(updatedBookingTicket, HttpStatus.OK);
    }
}
