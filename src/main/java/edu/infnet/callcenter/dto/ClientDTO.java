package edu.infnet.callcenter.dto;

import java.sql.Timestamp;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class ClientDTO {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String cpf;
	private String email;
	private Timestamp created_at;
	private Timestamp updated_at;
	private String telephone;
	private String cellphone;

	public ClientDTO() {

	}

	public ClientDTO(String name, String cpf, String email, Timestamp created_at, Timestamp updated_at) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private Collection<ClientsProductsDTO> products;

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

	public String getTelephone() {
		return telephone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
}
