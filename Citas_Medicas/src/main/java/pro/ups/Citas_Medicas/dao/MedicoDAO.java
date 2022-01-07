package pro.ups.Citas_Medicas.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pro.ups.Citas_Medicas.modelo.Medico;

@Stateless
public class MedicoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Medico medico) {
		em.persist(medico);
	}
	
	public void update(Medico medico) {
		em.merge(medico);
	}
	
	public Medico read(String cedula) {
		Medico m = em.find(Medico.class, cedula);
		return m;
	}
	
	public void delete(String cedula) {
		Medico m = em.find(Medico.class, cedula);
		em.remove(m);
	}
	
	public List<Medico> getMedicos(String nombre){
		
		String jpql2="SELECT p FROM Medico p WHERE nombre LIKE ?1";
		
		nombre= nombre+"%";
		Query query= em.createQuery(jpql2, Medico.class);
		query.setParameter(1, nombre);
		
		List<Medico> medicos=query.getResultList();
		return medicos;
		
	}

}
