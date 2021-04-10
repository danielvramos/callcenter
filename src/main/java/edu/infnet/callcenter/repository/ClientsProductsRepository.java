package edu.infnet.callcenter.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import edu.infnet.callcenter.dto.ClientDTO;
import edu.infnet.callcenter.dto.ClientsProductsDTO;


public interface ClientsProductsRepository extends JpaRepository<ClientsProductsDTO,Long> {

	public List<ClientsProductsDTO> findByClientId(Long client_id);
	

}
