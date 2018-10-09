package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Jacky.dao.ArchivesDeCasConcretsDao;
import com.Jacky.model.ArchivesDeCasConcrets;



@WebServlet("/CahierUnitaireLet")
public class CahierUnitaireLet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public CahierUnitaireLet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int cahier = Integer.parseInt(request.getParameter("idCahierDesCharges"));
		
		ArchivesDeCasConcretsDao affichage = new ArchivesDeCasConcretsDao();
		
		request.setAttribute("cahierUnitaire", affichage.getCahierById(cahier));
		
		RequestDispatcher rd = request.getRequestDispatcher("/CahierUnitaire.jsp");

		rd.forward(request, response);
	}

}
