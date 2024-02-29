package com.ticketAPI.Repoitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketAPI.entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Long>{

}
