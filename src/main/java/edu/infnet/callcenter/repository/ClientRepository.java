package edu.infnet.callcenter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.infnet.callcenter.dto.ClientDTO;

public interface ClientRepository extends CrudRepository<ClientDTO, Long> {

	public List<ClientDTO> findByCpf(String cpf);

}
