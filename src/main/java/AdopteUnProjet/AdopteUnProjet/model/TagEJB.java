package AdopteUnProjet.AdopteUnProjet.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@Entity
@Table(name = "TAGS")
@XmlRootElement
public class TagEJB implements Serializable {
    
	@Id
	@Size(min = 1, max = 50)
    private String tag;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
}
