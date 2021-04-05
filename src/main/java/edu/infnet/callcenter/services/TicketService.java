package edu.infnet.callcenter.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.infnet.callcenter.dto.TicketDTO;
import edu.infnet.callcenter.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository tr;

	public List<TicketDTO> getAll() {
		return (List<TicketDTO>) tr.findAll();
	}

	public TicketDTO save(TicketDTO ticket) {
		return tr.save(ticket);
	}

	public TicketDTO update(TicketDTO ticket, Long id) {
		ticket.setId(id);

		if(null == ticket.getUser_id()) return null;

		return tr.save(ticket);
	}

	public Optional<TicketDTO> getById(Long id) {
		return tr.findById(id);
	}

	public Optional<TicketDTO> deleteById(Long id) {
		Optional<TicketDTO> ticket = tr.findById(id);
		tr.deleteById(id);
		return ticket;
	}

	public Boolean exists(Long id) {
		return tr.existsById(id);
	}
}
