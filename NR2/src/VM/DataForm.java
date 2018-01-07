package VM;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "dataForm", eager = true)
public class DataForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String oneMenu = " ";
	private String[] manyListbox = {"1", "2", "3"};
	private String oneRadio = " ";

	public String getOneMenu() {
		return oneMenu;
	}

	public void setOneMenu(String oneMenu) {
		this.oneMenu = oneMenu;
	}

	public String[] getManyListbox() {
		return manyListbox;
	}

	public void setManyListbox(String[] manyListbox) {
		this.manyListbox = manyListbox;
	}

	public String getOneRadio() {
		return oneRadio;
	}

	public void setOneRadio(String oneRadio) {
		this.oneRadio = oneRadio;
	}

}
