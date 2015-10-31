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
@Table(name = "ANSWERS")
@XmlRootElement
public class AnswerEJB implements Serializable {
   
	@Id
    @GeneratedValue
    private Long id_answer;
    
    @NotNull
    @NotEmpty
    @OneToOne
	private QuestionEJB question;
    
    @NotNull
    @NotEmpty
    @OneToOne
	private AccountEJB account;
	
    @NotNull
    @NotEmpty
	private Date date;
    
    @NotNull
    @NotEmpty
	private String content;

	public Long getId_answer() {
		return id_answer;
	}

	public void setId_answer(Long id_answer) {
		this.id_answer = id_answer;
	}

	public QuestionEJB getQuestion() {
		return question;
	}

	public void setQuestion(QuestionEJB question) {
		this.question = question;
	}

	public AccountEJB getAccount() {
		return account;
	}

	public void setAccount(AccountEJB account) {
		this.account = account;
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
