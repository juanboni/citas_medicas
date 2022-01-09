package pro.ups.Citas_Medicas.modelo;

public class Cita {
	private int id;
	private String fecha;
	private Paciente paciente;
	private Medico medcio;
	private ConsultaMedica consulta;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedcio() {
		return medcio;
	}
	public void setMedcio(Medico medcio) {
		this.medcio = medcio;
	}
	public ConsultaMedica getConsulta() {
		return consulta;
	}
	public void setConsulta(ConsultaMedica consulta) {
		this.consulta = consulta;
	}
	
}
