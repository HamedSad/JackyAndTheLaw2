package Servlets;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.Jacky.model.ArchivesDeCasConcrets;
import com.Jacky.dao.ArchivesDeCasConcretsDao;

@WebServlet("/ArchivesDeCasConcretsLet")
public class ArchivesDeCasConcretsLet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ArchivesDeCasConcretsLet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArchivesDeCasConcretsDao affichage = new ArchivesDeCasConcretsDao();
		
		List<ArchivesDeCasConcrets> cahiers = affichage.getAllCahier();
		
		request.setAttribute("cahiers", cahiers);
		
		request.getRequestDispatcher("CahiersDesCharges.jsp").forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
