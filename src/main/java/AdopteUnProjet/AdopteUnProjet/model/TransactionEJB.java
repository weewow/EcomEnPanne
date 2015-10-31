package AdopteUnProjet.AdopteUnProjet.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@Table(name = "TRANSACTIONS")
@XmlRootElement
public class TransactionEJB implements Serializable {
	
	@EmbeddedId
	private TransactionPK id_transaction;

	@NotNull
    @NotEmpty
	private Date date;
	
	@NotNull
    @NotEmpty
	private Float amount;
	
	public TransactionPK getId_transaction() {
		return id_transaction;
	}

	public void setId_transaction(TransactionPK id_transaction) {
		this.id_transaction = id_transaction;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
}
