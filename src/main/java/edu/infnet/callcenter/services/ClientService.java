package edu.infnet.callcenter.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.infnet.callcenter.dto.ClientDTO;
import edu.infnet.callcenter.dto.ClientProductDTO;
import edu.infnet.callcenter.repository.ClientRepository;
import edu.infnet.callcenter.repository.ClientProductRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository cr;

	@Autowired
	private ClientProductRepository ClientProductRepository;

	public List<ClientDTO> getAll() {
		return (List<ClientDTO>) cr.findAll();
	}

	public ClientDTO save(ClientDTO client) {
		return cr.save(client);
	}

	public ClientDTO update(ClientDTO client, Long id) {
		client.setId(id);
		return cr.save(client);
	}

	public Optional<ClientDTO> getById(Long id) {
		return cr.findById(id);
	}
	public List<ClientDTO> getByCpf(String cpf) {
		return cr.findByCpf(cpf);
	}
	public Optional<ClientDTO> deleteById(Long id) {
		Optional<ClientDTO> client = cr.findById(id);
		cr.deleteById(id);
		return client;
	}

	public Boolean exists(Long id) {
		return cr.existsById(id);
	}

	public List<ClientProductDTO> getAllProducts(ClientDTO clientsProduct) {
		return (List<ClientProductDTO>) ClientProductRepository.findByClientId(clientsProduct.getId());
	}
}
