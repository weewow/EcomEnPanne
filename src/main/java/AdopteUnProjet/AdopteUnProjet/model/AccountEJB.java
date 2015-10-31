package AdopteUnProjet.AdopteUnProjet.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@Table(name = "ACCOUNTS")
@XmlRootElement
public class AccountEJB implements Serializable {

    @Id
    @GeneratedValue
    private Long id_account;
    
    @NotNull
    @NotEmpty
    @Email
	private String email;
	
    @NotNull
    @Size(min = 4, max = 25)
    @Pattern(regexp = "[^0-9]*", message = "Must not contain numbers")
	private String username;
    
    @NotNull
    @Size(min = 4, max = 25)
    @Pattern(regexp = "[\\w\\d]*", message = "Must not contain special characters")
	private String password;
	
	private String right;

	public Long getId_account() {
		return id_account;
	}

	public void setId_account(Long id) {
		this.id_account = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}
	
}
