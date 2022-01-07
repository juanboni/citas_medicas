package pro.ups.Citas_Medicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import pro.ups.Citas_Medicas.dao.MedicoDAO;
import pro.ups.Citas_Medicas.modelo.Medico;

@Stateless
public class MedicoON {
	
	
	@Inject
	private MedicoDAO daoMedico;
	
	public void insertMedico(Medico medico) throws Exception {
		
		
		daoMedico.insert(medico);	
	}

	public void updateMedico(Medico medico) throws Exception {
		
		daoMedico.update(medico);
	}
	
	public void deleteMedico(Medico medico) throws Exception {
		
		String cedula= medico.getCedula();
		 
		daoMedico.delete(cedula);
	}
	
	public List<Medico> getMedicos() {
		
		//if(!this.validaCedula(persona.getCedula()))
			//throw new Exception("Cedula incorrecta");
		//Persona per= daoPersona.read("0102930888");
		
		return daoMedico.getMedicos("%");
	}
}
