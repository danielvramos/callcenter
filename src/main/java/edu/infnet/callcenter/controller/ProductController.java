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

import edu.infnet.callcenter.dto.ProductDTO;
import edu.infnet.callcenter.services.ProductService;

@RestController
@RequestMapping("/produtcs")
public class ProductController {
		
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<ProductDTO> getProducts(){
		return productService.getAll();
	}

	@PostMapping
	public ProductDTO storeProduct(@RequestBody ProductDTO product) {
		return productService.save(product);
	}
	
	@PatchMapping("/{id}")
	public ProductDTO  patchUser(@RequestBody ProductDTO product, @PathVariable Long id) {
		if(!productService.exists(id)) return null;
				
		return productService.update(product, id);
	}
	 
	@GetMapping("/{id}")	
	public ProductDTO getProduct(@PathVariable Long id) {
		Optional<ProductDTO> product = productService.getById(id);
		if(product.isEmpty()) return null;
		return product.get();
	}
	 
    @DeleteMapping("/{id}")
	public Optional<ProductDTO> deletProduct( @PathVariable Long id) {
		if(!productService.exists(id)) return null;
				
		return productService.deteletById(id);
	}
}
