package pro.ups.Citas_Medicas.modelo;

public class Medico extends Persona{
	
	private int id;
	private String especialidad;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
