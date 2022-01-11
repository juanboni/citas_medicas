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
}
