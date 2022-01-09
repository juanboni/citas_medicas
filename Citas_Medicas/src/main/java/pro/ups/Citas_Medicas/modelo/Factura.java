package pro.ups.Citas_Medicas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Factura {
	private int id;
	private String FEcha;
	private Paciente paciente;
	private ArrayList<FacturaDetalle> detalles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFEcha() {
		return FEcha;
	}
	public void setFEcha(String fEcha) {
		FEcha = fEcha;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public ArrayList<FacturaDetalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(ArrayList<FacturaDetalle> detalles) {
		this.detalles = detalles;
	}
	
}
