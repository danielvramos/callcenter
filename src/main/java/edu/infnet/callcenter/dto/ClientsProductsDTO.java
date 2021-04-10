package edu.infnet.callcenter.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class ClientsProductsDTO {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="client_id", referencedColumnName = "id", nullable=false)    
	private ClientDTO client;
	
	@ManyToOne
	@JoinColumn(name="product_id", referencedColumnName= "id", nullable=false)    
	private ProductDTO product;
	
	public ClientsProductsDTO() {
		
	}
	
	public ClientsProductsDTO(ClientDTO client, ProductDTO product ) {
		this.client = client;
		this.product = product; 
		
	}

	public Long getId() {
		return this.id;
	}

	public ClientDTO getClient() {
		return client;
	}

	public ProductDTO getProduct() {
		return product;
	}
	
}
