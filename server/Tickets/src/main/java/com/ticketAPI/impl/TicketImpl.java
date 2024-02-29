package com.ticketAPI.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketAPI.Repoitory.TicketRepo;
import com.ticketAPI.entity.Ticket;
import com.ticketAPI.service.TicketService;

@Service
public class TicketImpl implements TicketService {

	@Autowired
	private TicketRepo ticketRepo;
	
	@Override
	public Ticket createTicket(Ticket ticket) {

		return this.ticketRepo.save(ticket);
	}

	
	
}
