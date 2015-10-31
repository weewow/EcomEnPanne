package AdopteUnProjet.AdopteUnProjet.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Embeddable
public class ProjectTagPK implements Serializable {
	
	@NotNull
	@NotEmpty
	private ProjectEJB project;
	
	@NotNull
	@NotEmpty
	private TagEJB tag;

	public ProjectEJB getProject() {
		return project;
	}

	public void setProject(ProjectEJB project) {
		this.project = project;
	}

	public TagEJB getTag() {
		return tag;
	}

	public void setTag(TagEJB tag) {
		this.tag = tag;
	}
	
    public boolean equals(Object o) { 
        return ((o instanceof TransactionPK) && 
        		tag.equals(((ProjectTagPK)o).getTag()) &&
        		project.equals(((ProjectTagPK)o).getProject()));
    }
    
    public int hashCode() { 
        return tag.hashCode() + project.hashCode(); 
    }
    
}
