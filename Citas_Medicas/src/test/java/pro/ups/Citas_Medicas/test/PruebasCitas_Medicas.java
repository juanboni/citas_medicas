package pro.ups.Citas_Medicas.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import pro.ups.Citas_Medicas.modelo.Cita;
import pro.ups.Citas_Medicas.modelo.ConsultaMedica;
import pro.ups.Citas_Medicas.modelo.Factura;
import pro.ups.Citas_Medicas.modelo.FacturaDetalle;
import pro.ups.Citas_Medicas.modelo.Horario;
import pro.ups.Citas_Medicas.modelo.Medico;
import pro.ups.Citas_Medicas.modelo.Paciente;

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
		c.setFecha("7/1/2022");
		Paciente m=new Paciente();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Albert Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		c.setPaciente(m);
		ConsultaMedica cm=new ConsultaMedica();
		cm.setId(1);
		cm.setDiagnostico("excelente");
		c.setConsulta(cm);

		assertTrue(c.getId()==1);
		assertTrue(c.getFecha()=="7/1/2022");
		assertTrue(c.getPaciente()==m);
		assertTrue(c.getConsulta()==cm);

		assertEquals(m.getId(),1);
		assertEquals(m.getCedula(),"0302882725");
		assertEquals(m.getDireccion(),"azogues 16 de abril");
		assertEquals(m.getTelefono(),"030288272");
		assertEquals(m.getFechaNacimiento(),"14/11/1998");
		assertEquals(m.getEmail(),"juanbny85@gmail.com");
		
		assertEquals(c.getId(),1);
		assertEquals(c.getFecha(),"7/1/2022");
		assertEquals(c.getPaciente(),m);
		assertEquals(c.getConsulta(),cm);
		
	}
	
	@Test
	public void testcrearconsulta() {
		ConsultaMedica cm=new ConsultaMedica();
		cm.setId(1);
		cm.setDiagnostico("excelente");
		
		assertTrue(cm.getId()==1);
		assertTrue(cm.getDiagnostico()=="excelente");

		assertEquals(cm.getId(),1);
		assertEquals(cm.getDiagnostico(),"excelente");
		
	}
	
	@Test
	public void testcrearhorario() {
		
		Horario h=new Horario();
		h.setId(1);
		//cita
		Cita c=new Cita();
		c.setId(1);
		c.setFecha("7/1/2022");
		Paciente m=new Paciente();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Albert Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		c.setPaciente(m);
		ConsultaMedica cm=new ConsultaMedica();
		cm.setId(1);
		cm.setDiagnostico("excelente");
		c.setConsulta(cm);
		ArrayList<Cita> citas=new ArrayList<Cita>();
		citas.add(c);
		h.setCitas(citas);
		h.setDia("martes");
		h.setHora(8);
		
		assertTrue(h.getId()==1);
		assertTrue(h.getCitas()==citas);
		assertTrue(h.getDia()=="martes");
		assertTrue(h.getHora()==8);
		

		assertEquals(h.getId(),1);
		assertEquals(h.getCitas(),citas);
		assertEquals(h.getDia(),"martes");
		assertEquals(h.getHora(),8);
	}
	
	
	@Test
	public void testcrearfactura() {
		Factura f=new Factura();
		f.setId(1);
		f.setFEcha("7/1/2022");
		Paciente m=new Paciente();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Albert Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		f.setPaciente(m);
		//detalle
		FacturaDetalle d=new FacturaDetalle();
		d.setId(1);
		//cita
		Cita c=new Cita();
		c.setId(1);
		c.setFecha("7/1/2022");
		Paciente m1=new Paciente();
		m1.setId(1);
		m1.setCedula("0302882725");
		m1.setNombres("Albert Boni");
		m1.setDireccion("azogues 16 de abril");
		m1.setTelefono("030288272");
		m1.setFechaNacimiento("14/11/1998");
		m1.setEmail("juanbny85@gmail.com");
		c.setPaciente(m1);
		ConsultaMedica cm=new ConsultaMedica();
		cm.setId(1);
		cm.setDiagnostico("excelente");
		c.setConsulta(cm);
		d.setCita(c);
		ArrayList<FacturaDetalle> fd=new ArrayList<FacturaDetalle>();
		fd.add(d);
		f.setDetalles(fd);
		assertTrue(cm.getId()==1);
		assertTrue(cm.getDiagnostico()=="excelente");
		assertEquals(cm.getId(),1);
		assertEquals(cm.getDiagnostico(),"excelente");	
	}
	
	

}
