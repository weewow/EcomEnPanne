package AdopteUnProjet.AdopteUnProjet.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@Table(name = "MESSAGES")
@XmlRootElement
public class MessageEJB implements Serializable {

    @Id
    @GeneratedValue
    private Long id_message;
    
    @NotNull
    @NotEmpty
    @OneToOne
	private AccountEJB account;
    
    @NotNull
    @NotEmpty
    @OneToOne
	private ProjectEJB project;
	
    @NotNull
    @NotEmpty
	private Date date;
    
    @NotNull
    @NotEmpty
	private String content;

	public Long getId_message() {
		return id_message;
	}

	public void setId_message(Long id_message) {
		this.id_message = id_message;
	}

	public AccountEJB getAccount() {
		return account;
	}

	public void setAccount(AccountEJB account) {
		this.account = account;
	}

	public ProjectEJB getProject() {
		return project;
	}

	public void setProject(ProjectEJB project) {
		this.project = project;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
