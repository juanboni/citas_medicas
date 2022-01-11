package pro.ups.Citas_Medicas.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import pro.ups.Citas_Medicas.modelo.Certificado;
import pro.ups.Citas_Medicas.modelo.Cita;
import pro.ups.Citas_Medicas.modelo.ConsultaMedica;
import pro.ups.Citas_Medicas.modelo.Factura;
import pro.ups.Citas_Medicas.modelo.FacturaDetalle;
import pro.ups.Citas_Medicas.modelo.HistorialClinico;
import pro.ups.Citas_Medicas.modelo.Horario;
import pro.ups.Citas_Medicas.modelo.Medico;
import pro.ups.Citas_Medicas.modelo.Paciente;
import pro.ups.Citas_Medicas.modelo.Receta;

public class PruebasCitas_Medicas {

	
	@Test
	public void testcrearmedico() {
		Medico m=new Medico();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Juan Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		m.setEspecialidad("general");
		
		
		assertTrue(m.getId()==1);
		assertTrue(m.getCedula()=="0302882725");
		assertTrue(m.getDireccion()=="azogues 16 de abril");
		assertTrue(m.getTelefono()=="030288272");
		assertTrue(m.getFechaNacimiento()=="14/11/1998");
		assertTrue(m.getEmail()=="juanbny85@gmail.com");
		assertTrue(m.getEspecialidad()=="general");
		
		
		
		assertEquals(m.getId(),1);
		assertEquals(m.getCedula(),"0302882725");
		assertEquals(m.getDireccion(),"azogues 16 de abril");
		assertEquals(m.getTelefono(),"030288272");
		assertEquals(m.getFechaNacimiento(),"14/11/1998");
		assertEquals(m.getEmail(),"juanbny85@gmail.com");
		assertEquals(m.getEspecialidad(),"general");
	}
	
	@Test
	public void testcrearpaciente() {
		Paciente m=new Paciente();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Albert Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		
		
		
		assertTrue(m.getId()==1);
		assertTrue(m.getCedula()=="0302882725");
		assertTrue(m.getDireccion()=="azogues 16 de abril");
		assertTrue(m.getTelefono()=="030288272");
		assertTrue(m.getFechaNacimiento()=="14/11/1998");
		assertTrue(m.getEmail()=="juanbny85@gmail.com");
		
		
		
		
		assertEquals(m.getId(),1);
		assertEquals(m.getCedula(),"0302882725");
		assertEquals(m.getDireccion(),"azogues 16 de abril");
		assertEquals(m.getTelefono(),"030288272");
		assertEquals(m.getFechaNacimiento(),"14/11/1998");
		assertEquals(m.getEmail(),"juanbny85@gmail.com");
		
	}
	
	
	@Test
	public void testcrearcita() {
		
		Cita c=new Cita();
		c.setId(1);
		Paciente m=new Paciente();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Albert Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		c.setPaciente(m);
		

		assertTrue(c.getId()==1);
		assertTrue(c.getPaciente()==m);
		assertEquals(m.getId(),1);
		assertEquals(m.getCedula(),"0302882725");
		assertEquals(m.getDireccion(),"azogues 16 de abril");
		assertEquals(m.getTelefono(),"030288272");
		assertEquals(m.getFechaNacimiento(),"14/11/1998");
		assertEquals(m.getEmail(),"juanbny85@gmail.com");
		
		assertEquals(c.getId(),1);
		
		assertEquals(c.getPaciente(),m);
		
		
	}
	
	@Test
	public void testcrearHorario() {
		Horario h=new Horario();
		h.setId(1);
		h.setFecha("9/1/2022");

		Cita c=new Cita();
		c.setId(1);
		Paciente m=new Paciente();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Albert Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		c.setPaciente(m);
		ArrayList<Cita> citas=new ArrayList<Cita>();
		citas.add(c);
		h.setCitas(citas);
		h.setDia("lunes");
		h.setHora(8);
		
		assertTrue(h.getId()==1);
		assertTrue(h.getFecha()=="9/1/2022");
		equals(h.getCitas()==citas);
		equals(h.getDia()=="lunes");
		equals(h.getHora()==8);
		
		
		
	}
	
	@Test
	public void testcrearconsulta() {
		ConsultaMedica cm=new ConsultaMedica();
		cm.setId(1);
		cm.setDiagnostico("excelente");
		//cita
		Cita c=new Cita();
		c.setId(1);
		Paciente m=new Paciente();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Albert Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		c.setPaciente(m);
		cm.setCita(c);
		assertTrue(cm.getId()==1);
		assertTrue(cm.getDiagnostico()=="excelente");
		assertTrue(cm.getCita()==c);

		assertEquals(cm.getId(),1);
		assertEquals(cm.getDiagnostico(),"excelente");
		assertEquals(cm.getCita(),c);
		
	}
	@Test
	public void testcrearreceta() {
		Receta r=new Receta();
		r.setId(1);
		r.setDiagnostico("excelente");
		//consultamedica
		ConsultaMedica cm=new ConsultaMedica();
		cm.setId(1);
		cm.setDiagnostico("excelente");
		//cita
		Cita c=new Cita();
		c.setId(1);
		Paciente m=new Paciente();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Albert Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		c.setPaciente(m);
		cm.setCita(c);
		r.setConsulta(cm);
		
		
		assertTrue(r.getId()==1);
		assertTrue(r.getDiagnostico()=="excelente");
		assertTrue(r.getConsulta()==cm);

		
		assertEquals(r.getId(),1);
		assertEquals(r.getDiagnostico(),"excelente");
		assertEquals(r.getConsulta(),cm);
	}
	
	@Test
	public void testcrearhistorialclinico() {
		
		HistorialClinico hc=new HistorialClinico();
		hc.setId(1);
		ConsultaMedica cm=new ConsultaMedica();
		cm.setId(1);
		cm.setDiagnostico("excelente");
		//cita
		Cita c=new Cita();
		c.setId(1);
		Paciente m=new Paciente();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Albert Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		c.setPaciente(m);
		cm.setCita(c);
		ArrayList<ConsultaMedica> consultas=new ArrayList<ConsultaMedica>();
		consultas.add(cm);
		hc.setConsultasmedicas(consultas);
		
		assertTrue(hc.getId()==1);
		assertTrue(hc.getConsultasmedicas()==consultas);
		
		assertEquals(hc.getId(),1);
		assertEquals(hc.getConsultasmedicas(),consultas);
		
		
	}
	
	@Test
	public void testcrearcertificados() {
		Certificado crt=new Certificado();

		crt.setId(1);
		ConsultaMedica cm=new ConsultaMedica();
		cm.setId(1);
		cm.setDiagnostico("excelente");
		//cita
		Cita c=new Cita();
		c.setId(1);
		Paciente m=new Paciente();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Albert Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		c.setPaciente(m);
		cm.setCita(c);
		ArrayList<ConsultaMedica> consultas=new ArrayList<ConsultaMedica>();
		consultas.add(cm);
		crt.setConsultasmedicas(consultas);
		
		assertTrue(crt.getId()==1);
		assertTrue(crt.getConsultasmedicas()==consultas);
		
		assertEquals(crt.getId(),1);
		assertEquals(crt.getConsultasmedicas(),consultas);
		
	}
	
	
	
	
	@Test
	public void testcrearfactura() {
		Factura f=new Factura();
		f.setId(1);
		f.setFecha("7/1/2022");
		
		
		//cita
		Cita c=new Cita();
		c.setId(1);
		//paciente
		Paciente m1=new Paciente();
		m1.setId(1);
		m1.setCedula("0302882725");
		m1.setNombres("Albert Boni");
		m1.setDireccion("azogues 16 de abril");
		m1.setTelefono("030288272");
		m1.setFechaNacimiento("14/11/1998");
		m1.setEmail("juanbny85@gmail.com");
		c.setPaciente(m1);
		//medico
		Medico md=new Medico();
		md.setId(1);
		md.setCedula("0302882725");
		md.setNombres("Juan Boni");
		md.setDireccion("azogues 16 de abril");
		md.setTelefono("030288272");
		md.setFechaNacimiento("14/11/1998");
		md.setEmail("juanbny85@gmail.com");
		md.setEspecialidad("general");
		c.setMedico(md);
		f.setCita(c);
		f.setTotal(40.00);
		
		assertTrue(f.getId()==1);
		assertTrue(f.getFecha()=="7/1/2022");
		assertTrue(f.getCita()==c);
		assertTrue(f.getTotal()==40.00);

		assertEquals(f.getId(),1);
		assertEquals(f.getFecha(),"7/1/2022");
		assertEquals(f.getCita(),c);
		
	}
	
	

}
