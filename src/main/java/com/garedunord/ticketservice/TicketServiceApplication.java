package com.garedunord.ticketservice;

import com.garedunord.ticketservice.entity.Ticket;
import com.garedunord.ticketservice.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class TicketServiceApplication implements CommandLineRunner {
	@Autowired
	private TicketRepository ticketRepository;

	public static void main(String[] args) {
		SpringApplication.run(TicketServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ticketRepository.saveAll(Arrays.asList(
				new Ticket("ADULT","SINGLE","MANCHESTER","LIVERPOOL","STD", 346271278, 24.56d,new Date(2022)),
				new Ticket("CHILD","SINGLE","PARIS","NANTES","STD", 535180367, 50.00d,new Date(2021)),
				new Ticket("ADULT","SINGLE","MANCHESTER","LIVERPOOL","STD", 346271278, 24.56d,new Date(2022)),
				new Ticket("ADULT","SINGLE","MANCHESTER","LIVERPOOL","STD", 346271278, 24.56d,new Date(2022)),
				new Ticket("ADULT","SINGLE","MANCHESTER","LIVERPOOL","STD", 346271278, 24.56d,new Date(2022)),
				new Ticket("ADULT","SINGLE","MANCHESTER","LIVERPOOL","STD", 346271278, 24.56d,new Date(2022)),
				new Ticket("ADULT","SINGLE","MANCHESTER","LIVERPOOL","STD", 346271278, 24.56d,new Date(2022)),
				new Ticket("ADULT","SINGLE","MANCHESTER","LIVERPOOL","STD", 346271278, 24.56d,new Date(2022))
		));
	}
}
