package edu.infnet.callcenter.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.infnet.callcenter.dto.ClientDTO;
import edu.infnet.callcenter.dto.ClientsProductsDTO;
import edu.infnet.callcenter.dto.ProductDTO;
import edu.infnet.callcenter.repository.ClientRepository;
import edu.infnet.callcenter.repository.ClientsProductsRepository;

@Service
public class ClientsProductsService {

	@Autowired
	private ClientsProductsRepository cr;



	public List<ClientsProductsDTO> getAllByClient(ClientDTO clientsProduct) {
		
		return (List<ClientsProductsDTO>) cr.findByClientId(clientsProduct.getId());
	}
	
	
	public ClientsProductsDTO add(ClientsProductsDTO clientsProduct) {
		
		return cr.save(clientsProduct);
	}

	public Optional<ClientsProductsDTO> deleteById(Long id) {
		Optional<ClientsProductsDTO> clientsProduct = cr.findById(id);
		cr.deleteById(id);
		return clientsProduct;
	}
	public Boolean exists(Long id) {
		return cr.existsById(id);
	}


	
}
