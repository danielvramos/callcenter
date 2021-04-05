package edu.infnet.callcenter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.infnet.callcenter.dto.TicketDTO;
import edu.infnet.callcenter.services.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private TicketService ts;

	@GetMapping
	public List<TicketDTO> getTickets(){
		return ts.getAll();
	}

	@PostMapping
	public TicketDTO storeTicket(@RequestBody TicketDTO ticket) {
		return ts.save(ticket);
	}

	@PatchMapping("/{id}")
	public TicketDTO patchTicket(@RequestBody TicketDTO ticket, @PathVariable Long id) {
		if(!ts.exists(id)) return null;

		return ts.update(ticket, id);
	}

	@GetMapping("/{id}")
	public TicketDTO getTicket(@PathVariable Long id) {
		Optional<TicketDTO> ticket = ts.getById(id);
		if(ticket.isEmpty()) return null;

		return ticket.get();
	}

    @DeleteMapping("/{id}")
	public Optional<TicketDTO> deteleTicket(@PathVariable Long id){
		if(!ts.exists(id)) return null;

		return ts.deleteById(id);
	}
}
