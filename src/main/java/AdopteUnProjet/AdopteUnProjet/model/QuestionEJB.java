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
@Table(name = "QUESTIONS")
@XmlRootElement
public class QuestionEJB implements Serializable {

    @Id
    @GeneratedValue
    private Long id_question;
    
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

	public Long getId_question() {
		return id_question;
	}

	public void setId_question(Long id_question) {
		this.id_question = id_question;
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
