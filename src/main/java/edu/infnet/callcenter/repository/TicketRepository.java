package edu.infnet.callcenter.repository;

import org.springframework.data.repository.CrudRepository;

import edu.infnet.callcenter.dto.TicketDTO;

public interface TicketRepository extends CrudRepository<TicketDTO,Long> {
	

}
