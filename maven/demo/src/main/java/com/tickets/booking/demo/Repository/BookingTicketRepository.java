
package com.tickets.booking.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tickets.booking.demo.Model.BookingTicket;

public interface BookingTicketRepository extends JpaRepository<BookingTicket, Long> {
}

