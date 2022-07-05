package com.garedunord.ticketservice.service;

import com.garedunord.ticketservice.entity.Ticket;
import com.garedunord.ticketservice.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getListTicket (){
        List<Ticket> ticketTrain = ticketRepository.findAll();
        return ticketTrain;
    }

    public Optional<Ticket> getTicketById(long id) {
        return ticketRepository.findById(id);
    }

    public void deleteTicket(long id) {
        Ticket ticket = null;
        String.format("Le ticket numero %s a ete annule !", ticket.getId());
        ticketRepository.deleteById(id);
    }

    public Ticket updateTicket(long id, Ticket ticket) {
        Optional<Ticket> ticketOptional = ticketRepository.findById(id);
        if (ticketOptional.isPresent()){
            ticketOptional.get().setPassengerType(ticket.getPassengerType());
            ticketOptional.get().setTicketType(ticket.getTicketType());
            ticketOptional.get().setCityCurrent(ticket.getCityCurrent());
            ticketOptional.get().setCityDestination(ticket.getCityDestination());
            ticketOptional.get().setTicketNumber(ticket.getTicketNumber());
            ticketOptional.get().setDateValid(ticket.getDateValid());
            ticketOptional.get().setPrice(ticket.getPrice());
            return ticketRepository.save(ticketOptional.get());
        }
        else {
            return ticketOptional.orElseThrow(()->new RuntimeException("Pas de Ticket !!!"));
        }
    }

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

}
