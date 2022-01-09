package pro.ups.Citas_Medicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import pro.ups.Citas_Medicas.dao.PersonaDAO;
import pro.ups.Citas_Medicas.modelo.Persona;


@Stateless
public class PersonaON {

	@Inject
	private PersonaDAO daoPersona;
	
	public void insertPersona(Persona persona) throws Exception {
		
		
		daoPersona.insert(persona);	
	}

	public void updateTurno(Persona persona) throws Exception {
		
		daoPersona.update(persona);
	}
	
	public void deleteTurno(Persona persona) throws Exception {
		
		String cedula= persona.getCedula();
		 
		daoPersona.delete(cedula);
	}
	
	public List<Persona> getPersona() {
		
		//if(!this.validaCedula(persona.getCedula()))
			//throw new Exception("Cedula incorrecta");
		//Persona per= daoPersona.read("0102930888");
		
		return daoPersona.getPersonas("%");
	}
}
