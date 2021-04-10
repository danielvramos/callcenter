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
import javax.persistence.OneToMany;

@Entity
public class ClientDTO  {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String cpf;
	private String email;
	private String type;
	private String registered_at;
	private String updated_at;
	private String telefone;
	private String celular;
	
	public ClientDTO() {

	}

	public ClientDTO(String name, String cpf, String email, String type) {
		this.name = name;
		this.type = type;
		this.cpf = cpf;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public String getType() {
		return type;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCelular() {
		return celular;
	}
	
	@OneToMany(mappedBy="client", cascade = CascadeType.ALL)
	private Collection<ClientsProductsDTO> products;


	
	

}
