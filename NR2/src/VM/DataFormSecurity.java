package VM;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "security", eager = true)
public class DataFormSecurity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


}
