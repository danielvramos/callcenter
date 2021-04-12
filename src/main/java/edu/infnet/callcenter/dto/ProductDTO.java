package edu.infnet.callcenter.dto;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductDTO {

	@Id
	@GeneratedValue
	private Long id;

	private String serial_number;
	private String name;

	public ProductDTO() {

	}

	public ProductDTO(String serial_number, String name) {
		this.serial_number = serial_number;
		this.name = name;
	}

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Collection<ClientProductDTO> products;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSerial_number() {
		return serial_number;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
