package edu.infnet.callcenter.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

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
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private Collection<ClientsProductsDTO> products;

	
}
