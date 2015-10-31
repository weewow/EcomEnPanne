import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

@ManagedBean
@RequestScoped
public class NullBean implements Serializable{

	public NullBean() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void doNothing(){}

}
