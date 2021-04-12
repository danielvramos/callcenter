package edu.infnet.callcenter.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.infnet.callcenter.dto.ClientProductDTO;

public interface ClientProductRepository extends JpaRepository<ClientProductDTO, Long> {
	public List<ClientProductDTO> findByClientId(Long client_id);
}
