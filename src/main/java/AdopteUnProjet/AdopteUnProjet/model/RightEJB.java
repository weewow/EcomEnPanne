package AdopteUnProjet.AdopteUnProjet.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@Entity
@Table(name = "RIGHTS")
@XmlRootElement
public class RightEJB implements Serializable {

    @Id
    private Long id_page;
    
    private Character right;

	public Long getId_page() {
		return id_page;
	}

	public void setId_page(Long id_page) {
		this.id_page = id_page;
	}

	public Character getRight() {
		return right;
	}

	public void setRight(Character right) {
		this.right = right;
	}
}
