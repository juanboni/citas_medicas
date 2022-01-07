package pro.ups.Citas_Medicas.modelo;

import java.util.Date;

public class Turno {
	
	private int codigo;
	private int numTurno;
	private Date hora;
	private double valor;
	private Paciente paciente;
	private Medico medico;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumTurno() {
		return numTurno;
	}
	public void setNumTurno(int numTurno) {
		this.numTurno = numTurno;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
	
	
	
	
}
