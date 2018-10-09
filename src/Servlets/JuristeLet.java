package Servlets;

import java.util.List;
import java.util.ArrayList;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Jacky.model.Juriste;
import com.Jacky.dao.JuristeDao;



@WebServlet("/JuristeLet")
public class JuristeLet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public JuristeLet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		JuristeDao affichage = new JuristeDao();
		
		List<Juriste> juriste = affichage.getAllJuristes();
		
		request.setAttribute("juriste", juriste);
		
		request.getRequestDispatcher("Juristes.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
