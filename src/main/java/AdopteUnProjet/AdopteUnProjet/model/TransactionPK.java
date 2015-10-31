package AdopteUnProjet.AdopteUnProjet.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Embeddable
public class TransactionPK implements Serializable {
	@NotNull
	@NotEmpty
	private AccountEJB account; 
	
	@NotNull
	@NotEmpty
	private ProjectEJB project; 
	
	public AccountEJB getAccount() {
		return account;
	}

	public void setAccount(AccountEJB id_account) {
		this.account = id_account;
	}

	public ProjectEJB getProject() {
		return project;
	}

	public void setProject(ProjectEJB id_projects) {
		this.project = id_projects;
	}

    public boolean equals(Object o) { 
        return ((o instanceof TransactionPK) && 
        		account.equals(((TransactionPK)o).getAccount()) &&
        		project.equals(((TransactionPK)o).getProject()));
    }
    
    public int hashCode() { 
        return account.hashCode() + project.hashCode(); 
    }
}
