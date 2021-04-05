package edu.infnet.callcenter.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductDTO {

	@Id
	@GeneratedValue
	private long id;
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
}
