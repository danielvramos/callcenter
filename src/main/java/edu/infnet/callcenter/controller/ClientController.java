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

import edu.infnet.callcenter.dto.ClientDTO;
import edu.infnet.callcenter.services.ClientService;

@RestController 
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private ClientService cs;

	@GetMapping
	public List<ClientDTO> getClients(){
		return cs.getAll();
	}

	@PostMapping
	public ClientDTO storeClient(@RequestBody ClientDTO client) {
		return cs.save(client);
	}

	@PatchMapping("/{id}")
	public ClientDTO patchClient(@RequestBody ClientDTO client, @PathVariable Long id) {
		if(!cs.exists(id)) return null;

		return cs.update(client, id);
	}

	@GetMapping("/{id}")
	public ClientDTO getClient (@PathVariable Long id) {
		Optional<ClientDTO> client = cs.getById(id);
		if(client.isEmpty())return null;

		return client.get();
	}

	@DeleteMapping("/{id}")
	public Optional<ClientDTO> deleteClient(@PathVariable Long id){
		if(!cs.exists(id)) return null; 
	
		return cs.deleteById(id);
	}
}
