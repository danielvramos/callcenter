package edu.infnet.callcenter.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class TicketDTO {

		@Id
		@GeneratedValue
		private Long id;
		private String serial_number;
		private String product_name;
		private String client_name;
		private String client_telefone;
		private String user_name;
		private String status;
		private String briefing;
		private String error_code;
		private String detail;
		private Boolean finished;
		public TicketDTO(){}
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public TicketDTO(String serial_number, String product_name, String client_name, String client_telefone,
				String user_name, String status, String briefing, String error_code, String detail, Boolean finished) {
			super();
			this.serial_number = serial_number;
			this.product_name = product_name;
			this.client_name = client_name;
			this.client_telefone = client_telefone;
			this.user_name = user_name;
			this.status = status;
			this.briefing = briefing;
			this.error_code = error_code;
			this.detail = detail;
			this.finished = finished;
		}


		public String getSerial_number() {
			return serial_number;
		}
		public String getProduct_name() {
			return product_name;
		}
		public String getClient_name() {
			return client_name;
		}
		public String getStatus() {
			return status;
		}
		public String getBriefing() {
			return briefing;
		}
		public String getError_code() {
			return error_code;
		}
		public String getDetail() {
			return detail;
		}
		public Boolean getFinished() {
			return finished;
		}


		public String getClient_telefone() {
			return client_telefone;
		}


		public String getUser_name() {
			return user_name;
		}
		
}
