package VM;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

//import javax.faces.view.ViewScoped;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ViewScoped
@ManagedBean
public class DarbuotojaiView {
	@ManagedProperty(value = "#{darbuotojaiModel}")
	private DarbuotojaiModel darbuotojaiModel;

	public DarbuotojaiModel getDarbuotojaiModel() {
		return darbuotojaiModel;
	}

	public void setDarbuotojaiModel(DarbuotojaiModel darbuotojaiModel) {
		this.darbuotojaiModel = darbuotojaiModel;
	}

	public void create() {
		
		darbuotojaiModel.setRedaguojamasDarbuotojas(new Darbuotojas());
	}

	public void read() {

	}

	public void update(Integer id) {
		darbuotojaiModel.setRedaguojamasDarbuotojas(darbuotojaiModel.searchDarbuotojasById(id));
	}

	public void delete(Integer id) {
		darbuotojaiModel.getDarbuotojai().remove(darbuotojaiModel.searchDarbuotojasById(id));
		darbuotojaiModel.setRedaguojamasDarbuotojas(null);
		zinute("Darbuotojas pasalintas");
	}

	public void cancel() {
		darbuotojaiModel.setRedaguojamasDarbuotojas(null);
	}

	public void save() {
		Integer id = darbuotojaiModel.getRedaguojamasDarbuotojas().getId();
		if (id != null) {
			darbuotojaiModel.searchDarbuotojasById(id)
					.setVardas(darbuotojaiModel.getRedaguojamasDarbuotojas().getVardas());
			darbuotojaiModel.searchDarbuotojasById(id)
					.setPavarde(darbuotojaiModel.getRedaguojamasDarbuotojas().getPavarde());
			zinute("Darbuotojas atnaujintas");
		} else {
			darbuotojaiModel.getRedaguojamasDarbuotojas().setId(darbuotojaiModel.getDarbuotojai().size());
			darbuotojaiModel.getDarbuotojai().add(darbuotojaiModel.getRedaguojamasDarbuotojas());
			zinute("Darbuotojas pridetas");
		}
		darbuotojaiModel.setRedaguojamasDarbuotojas(null);
	}
	
	protected void zinute(String zinute) {
		FacesMessage doneMessage = new FacesMessage(zinute);
		FacesContext.getCurrentInstance().addMessage(null, doneMessage);
		}
}
