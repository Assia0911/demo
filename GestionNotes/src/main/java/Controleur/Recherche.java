package Controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ModelProfesseur;


@WebServlet("/recherche")
public class Recherche extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ModelProfesseur p;
       
    public Recherche() {
        super();
        p=new ModelProfesseur();
       
    }

	
	protected void doGet(HttpServletRequest rq, HttpServletResponse rp) throws ServletException, IOException {
		String Mocle=rq.getParameter("motCle");
		rq.setAttribute("listeEt", p.getByMotCle(Mocle));
		rq.getRequestDispatcher("Liste_prof.jsp").forward(rq, rp);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
