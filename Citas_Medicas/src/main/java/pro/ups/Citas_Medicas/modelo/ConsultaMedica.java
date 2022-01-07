package pro.ups.Citas_Medicas.modelo;

public class ConsultaMedica {
	
	private String estado;
	private String evaluacion;
	private String observacion;
	private String sugerencia;
	private Turno turno;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEvaluacion() {
		return evaluacion;
	}
	public void setEvaluacion(String evaluacion) {
		this.evaluacion = evaluacion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getSugerencia() {
		return sugerencia;
	}
	public void setSugerencia(String sugerencia) {
		this.sugerencia = sugerencia;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	
	
	
}
