package AdopteUnProjet.AdopteUnProjet.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@Table(name = "PROJECT_TAGS")
@XmlRootElement
public class ProjectTagEJB implements Serializable {
	
	@EmbeddedId
	@NotNull
	@NotEmpty
	private ProjectTagPK projectTag;

	public ProjectTagPK getProjectTag() {
		return projectTag;
	}

	public void setProjectTag(ProjectTagPK projectTag) {
		this.projectTag = projectTag;
	}
	
}
