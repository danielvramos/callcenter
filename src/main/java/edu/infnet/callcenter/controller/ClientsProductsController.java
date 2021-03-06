package edu.infnet.callcenter.controller;

import java.util.ArrayList;
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
import edu.infnet.callcenter.dto.ClientProductDTO;
import edu.infnet.callcenter.dto.ProductDTO;
import edu.infnet.callcenter.services.ClientService;
import edu.infnet.callcenter.services.ProductService;

@RestController 
@RequestMapping("/clientsproducts")
public class ClientsProductsController {

	@Autowired
	private ClientService cs;
	@Autowired 
	private ProductService ps;

	// @GetMapping("/{cpf}")
	// public List<ProductDTO> getProductsByCPF(@PathVariable String cpf){
	// 	ClientDTO client = cs.getByCpf(cpf).get(0);
	// 	List<ProductDTO> ProductList = new ArrayList();
	// 	for (ClientProductDTO clientProduct : cps.getAllByClient(client)){
	// 		ProductList.add(clientProduct.getProduct());
	// 	}
		
	// 	return ProductList;
	// }

	
	// @PatchMapping("/{id_client}/{id_product}")
	// public ClientProductDTO addProduct (@PathVariable Long id_client, @PathVariable Long id_product) {
	// 	if(!ps.exists(id_product) || !cs.exists(id_client) ) return null;
		
	// 	ClientProductDTO clients_products = new ClientProductDTO(cs.getById(id_client).get(),ps.getById(id_product).get() );

	// 	return cps.add(clients_products);
	// }
	
	// @DeleteMapping("/{id}")
	// public Optional<ClientProductDTO> removeProduct(@PathVariable Long id) {
	// 	if(!cps.exists(id)) return null;	
	// 	return cps.deleteById(id);
	// }
}
