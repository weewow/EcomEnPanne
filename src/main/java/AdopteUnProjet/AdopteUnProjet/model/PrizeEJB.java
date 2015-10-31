package AdopteUnProjet.AdopteUnProjet.model;

import java.io.Serializable;

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
@Table(name = "PRIZES")
@XmlRootElement
public class PrizeEJB implements Serializable {
    @Id
    @GeneratedValue
    private Long id_prize;
    
    @NotNull
    @NotEmpty
    @OneToOne
	private ProjectEJB project;
	
    @NotNull
    @NotEmpty
	private Float amount;
    
    @NotNull
    @NotEmpty
	private String prize;

	public Long getId_prize() {
		return id_prize;
	}

	public void setId_prize(Long id_prize) {
		this.id_prize = id_prize;
	}

	public ProjectEJB getProject() {
		return project;
	}

	public void setProject(ProjectEJB project) {
		this.project = project;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}
	
}
