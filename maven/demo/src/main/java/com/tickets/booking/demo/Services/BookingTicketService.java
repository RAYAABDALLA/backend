package com.tickets.booking.demo.Services;

import com.tickets.booking.demo.Model.BookingTicket;
import com.tickets.booking.demo.Repository.BookingTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingTicketService {

    @Autowired
    private BookingTicketRepository bookingTicketRepo;

    public BookingTicket createBookingTicket(BookingTicket bookingTicket) {
        return bookingTicketRepo.save(bookingTicket);
    }

    public List<BookingTicket> getAllBookingTicket() {
        return bookingTicketRepo.findAll();
    }

    public BookingTicket getBookingTicketById(Long bookingTicketId) {
        Optional<BookingTicket> bookingTicket = bookingTicketRepo.findById(bookingTicketId);
        return bookingTicket.orElse(null);
    }

    public void deleteBookingTicket(Long bookingTicketId) {
        bookingTicketRepo.deleteById(bookingTicketId);
    }

    public BookingTicket updateBookingTicket(Long bookingTicketId, BookingTicket bookingTicket) {
        BookingTicket existingBooking = bookingTicketRepo.findById(bookingTicketId).orElse(null);
        if (existingBooking != null) {
            existingBooking.setPassengerName(bookingTicket.getPassengerName());
            existingBooking.setBusRoute(bookingTicket.getBusRoute());
            existingBooking.setBookingDate(bookingTicket.getBookingDate());
            existingBooking.setTime(bookingTicket.getTime());
            existingBooking.setSeatNumber(bookingTicket.getSeatNumber());
            existingBooking.setSelectBus(bookingTicket.getSelectBus());
           
            return bookingTicketRepo.save(existingBooking);
        }
        return null;
    }
}
