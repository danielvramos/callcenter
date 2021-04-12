package edu.infnet.callcenter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.infnet.callcenter.Enum.StatusEnum;
import edu.infnet.callcenter.dto.TicketDTO;

public interface TicketRepository extends CrudRepository<TicketDTO,Long> {

	List<TicketDTO> findAllByStatus(StatusEnum consertado);
	

}
