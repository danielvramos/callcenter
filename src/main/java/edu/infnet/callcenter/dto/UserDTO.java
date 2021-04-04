package edu.infnet.callcenter.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDTO {
    
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String type;
    private String registered_at;
    private String updated_at;
    
    public UserDTO() {

    }

    public UserDTO(String name, String cpf, String email, String type) {
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


}
