package VM;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class DarbuotojaiModel {
	
	private List<Darbuotojas> darbuotojai = new ArrayList<Darbuotojas>();
	private Darbuotojas redaguojamasDarbuotojas = null;
	
	@PostConstruct public void postConstruct() {
		
	}
	
	//Surasti darbuotoja pagal jo ID
	public Darbuotojas searchDarbuotojasById(Integer id) {
		for (Darbuotojas searchDarbuotojas : darbuotojai) {
			if (searchDarbuotojas.getId() == id) return searchDarbuotojas;
		}
		return null;
		
	}

	public List<Darbuotojas> getDarbuotojai() {
		return darbuotojai;
	}

	public void setDarbuotojai(List<Darbuotojas> darbuotojai) {
		this.darbuotojai = darbuotojai;
	}

	public Darbuotojas getRedaguojamasDarbuotojas() {
		return redaguojamasDarbuotojas;
	}

	public void setRedaguojamasDarbuotojas(Darbuotojas redaguojamasDarbuotojas) {
		this.redaguojamasDarbuotojas = redaguojamasDarbuotojas;
	}
}
