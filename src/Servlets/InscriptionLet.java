package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Jacky.dao.UsersDao;
import com.Jacky.model.Users;

@WebServlet(description = "servlet associée à InscriptionLet.jsp", urlPatterns = { "/InscriptionLet" })

public class InscriptionLet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public InscriptionLet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		System.out.println("test 1");
		doGet(request, response);
		
		UsersDao dao = new UsersDao();
		
		String nom = request.getParameter("nomUser");
		String prenom = request.getParameter("prenomUser");
		String motDePasse = request.getParameter("motDePasse");
		String motDePasse2 = request.getParameter("motDePasse2");
		String mail = request.getParameter("mail");
		String entreprise = request.getParameter("entreprise");
		String domaineProfessionel = request.getParameter("domaineProfessionel");
		
		Users register = new Users();
		
		System.out.println("test 2");
		
			System.out.println("test 3");
			
		if(motDePasse.equals(motDePasse2))	{
			dao.addUser(register, nom, prenom, motDePasse, mail, entreprise, domaineProfessionel);
			System.out.println("test 4");
			this.getServletContext().getRequestDispatcher("/Test.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMotdePasse", "Les mots de passe ne sont pas identiques");
			this.getServletContext().getRequestDispatcher("/Inscription.jsp").forward(request, response);
		}
		
	}
}
