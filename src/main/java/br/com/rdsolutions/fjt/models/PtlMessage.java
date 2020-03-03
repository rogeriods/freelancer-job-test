package br.com.rdsolutions.fjt.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ptl_message")
public class PtlMessage {
	
	@Id
	private int id;
	
	@Column(name = "entity_type")
	private String entityType;
	
	@Column(name = "entity_nbr")
	private String entityNbr;
	
	@Column(name = "stat_code")
	private int statCode;
	
	@Column(name = "outgoing_message")
	private String outgoingMessage;
	
	@Column(name = "incoming_message")
	private String incomingMessage;
	
	@Column(name = "start_messaging_date_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startMessagingDateTime;
	
	@Column(name = "end_messaging_date_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endMessagingDateTime;

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getEntityNbr() {
		return entityNbr;
	}

	public void setEntityNbr(String entityNbr) {
		this.entityNbr = entityNbr;
	}

	public int getStatCode() {
		return statCode;
	}

	public void setStatCode(int statCode) {
		this.statCode = statCode;
	}

	public String getOutgoingMessage() {
		return outgoingMessage;
	}

	public void setOutgoingMessage(String outgoingMessage) {
		this.outgoingMessage = outgoingMessage;
	}

	public String getIncomingMessage() {
		return incomingMessage;
	}

	public void setIncomingMessage(String incomingMessage) {
		this.incomingMessage = incomingMessage;
	}

	public Date getStartMessagingDateTime() {
		return startMessagingDateTime;
	}

	public void setStartMessagingDateTime(Date startMessagingDateTime) {
		this.startMessagingDateTime = startMessagingDateTime;
	}

	public Date getEndMessagingDateTime() {
		return endMessagingDateTime;
	}

	public void setEndMessagingDateTime(Date endMessagingDateTime) {
		this.endMessagingDateTime = endMessagingDateTime;
	}

	// Hash and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PtlMessage other = (PtlMessage) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
