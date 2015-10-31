
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.persistence.Id;

/**
 * @author chevailler
 *
 */
public class Session {
	private boolean logged;
	private String headerName;
	
	public Session() {
		logged= false;
		setHeaderName("header.xhtml");
	}

	public boolean getisLogged() {
		return logged;
	}

	public void setisLogged(boolean logged) {
		this.logged = logged;
		if (logged){
			setHeaderName("header2.xhtml");
		}else{
			setHeaderName("header.xhtml");
		}
	}
	
	public String getHeaderName() {
		return headerName;
	}

	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}
	
	public void doLog(){
		logged= true;
		headerName= "header2.xhtml";
	}
	
	public String whatHeader(){
		if(logged){
			return "header2.xhtml";
		}else{
			return "header.xhtml";
		}
	}




}
