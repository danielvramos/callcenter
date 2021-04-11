package edu.infnet.callcenter.dto;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class TicketDTO {

	@Id
	@GeneratedValue
	private Long id;

	private Long user_id;
	private Long serial_number;
	private String status;
	private String client_name;
	private String briefing;
	private String error_code;
	private String description;
	private Boolean finished;
	private Timestamp created_at;
	private Timestamp updated_at;

	public TicketDTO() {

	}

	public TicketDTO(Long serial_number, String status, String client_name, String briefing, String error_code,
			String description, Boolean finished, Timestamp created_at, Timestamp updated_at) {
		this.serial_number = serial_number;
		this.status = status;
		this.client_name = client_name;
		this.briefing = briefing;
		this.error_code = error_code;
		this.description = description;
		this.finished = finished;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
	private UserDTO users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public Long getSerial_number() {
		return serial_number;
	}

	public String getStatus() {
		return status;
	}

	public String getClient_name() {
		return client_name;
	}

	public String getBriefing() {
		return briefing;
	}

	public String getError_code() {
		return error_code;
	}

	public String getDescription() {
		return description;
	}

	public Boolean getFinished() {
		return finished;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}
}
