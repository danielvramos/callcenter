package edu.infnet.callcenter.dto;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.infnet.callcenter.Enum.StatusEnum;

@Entity
@Table(name = "tickets")
public class TicketDTO {

	@Id
	@GeneratedValue
	private Long id;

	private Long user_id;
	private Long serial_number;
	@Enumerated(EnumType.STRING)
	private StatusEnum status;
	private String client_name;
	private String briefing;
	private String error_code;
	private String description;
	private Boolean finished;
	private Timestamp created_at;
	private Timestamp updated_at;

	public TicketDTO() {

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

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
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
