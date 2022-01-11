package pro.ups.Citas_Medicas.views.copy;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import pro.ups.Citas_Medicas.business.MedicoON;
import pro.ups.Citas_Medicas.modelo.Medico;

/**
 * Servlet implementation class ventanaprincipal
 */
@WebServlet("/ventanaprincipal")
public class ventanaprincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@Inject
    private MedicoON medicoon;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ventanaprincipal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//---Medico
		System.out.println("insertAR MEDICO");
		Medico m=new Medico();
		m.setId(1);
		m.setCedula("0302882725");
		m.setNombres("Juan Boni");
		m.setDireccion("azogues 16 de abril");
		m.setTelefono("030288272");
		m.setFechaNacimiento("14/11/1998");
		m.setEmail("juanbny85@gmail.com");
		m.setEspecialidad("general");
		
		try {
			medicoon.insertMedico(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//System.out.println("insertado"+medicoon.getMedicos());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
