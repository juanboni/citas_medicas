package pro.ups.Citas_Medicas.modelo;

import java.util.ArrayList;

public class Horario {
	private int id ;
	private ArrayList<Cita> citas;
	private String dia;
	private int hora;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Cita> getCitas() {
		return citas;
	}
	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
}
