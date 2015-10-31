package AdopteUnProjet.AdopteUnProjet.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@Table(name = "WAITING_PROJECTS")
@XmlRootElement
public class WaitingProjectEJB implements Serializable {
	
    @Id
    @GeneratedValue
    private Long id_project;
    
    @NotNull
    @OneToOne
	private AccountEJB account;
	
    @NotNull
    @Size(min = 4, max = 50)
	private String title;
    
    public Long getId_project() {
		return id_project;
	}

	public void setId_project(Long id_project) {
		this.id_project = id_project;
	}

	public AccountEJB getAccount() {
		return account;
	}

	public void setAccount(AccountEJB account) {
		this.account = account;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getGoal() {
		return goal;
	}

	public void setGoal(Float goal) {
		this.goal = goal;
	}

	@NotNull
	private Date beginDate;
    
    @NotNull
	private Date endDate;
    
    @NotNull
    @NotEmpty
	private String description;
	
    @NotNull
    @NotEmpty
	private Float goal;
	
}
