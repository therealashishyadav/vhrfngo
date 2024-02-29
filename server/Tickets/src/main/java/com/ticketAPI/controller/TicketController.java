package com.ticketAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketAPI.entity.Ticket;
import com.ticketAPI.service.TicketService;

@RestController
@RequestMapping("/ticket")
@CrossOrigin (origins = "http://localhost:4200")
public class TicketController {

	@Autowired
	private TicketService ticketService ;
	
	@PostMapping
	public Ticket newTicket(@RequestBody Ticket ticket) {
		return this.ticketService.createTicket(ticket);
	}
	
	
}
