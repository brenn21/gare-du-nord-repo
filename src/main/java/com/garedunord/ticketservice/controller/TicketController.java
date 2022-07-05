package com.garedunord.ticketservice.controller;

import com.garedunord.ticketservice.entity.Ticket;
import com.garedunord.ticketservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("gare/v1/ticket")
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> getList(){
        return ticketService.getListTicket();
    }

    @GetMapping("/{id}")
    public Optional<Ticket> getTicketById(@PathVariable long id){
        return ticketService.getTicketById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTicket(@PathVariable long id){
        ticketService.deleteTicket(id);
    }

    @PutMapping("/update/{id}")
    public Ticket updateTicket(@PathVariable long id, @RequestBody Ticket ticket) {
        return ticketService.updateTicket(id, ticket);
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }
}
