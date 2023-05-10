package Controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.ModelCompte;
import Model.ModelProfesseur;
import Persistance.PersistanceEtudiant;

@WebServlet("/Login")
public class HomeControleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ModelCompte mod;


	public HomeControleur() {
		super();
	}
	
	public void init() {
		this.mod=new ModelCompte();
	}

	protected void doPost(HttpServletRequest rq, HttpServletResponse rp) throws ServletException, IOException {
		String login = rq.getParameter("Login");
		String password = rq.getParameter("Password");
		PersistanceEtudiant ps= new PersistanceEtudiant();
		
		if (login.compareTo("admin") == 0 && password.compareTo("admin") == 0) {
			HttpSession ses=rq.getSession();
			ses.setAttribute("nom", "admin");
			ses.setAttribute("prenom", "admin");
			rq.getRequestDispatcher("Home.jsp").forward(rq, rp);
		
		}else if(login.compareTo("")==0||password.compareTo("")==0) {
			rq.setAttribute("style", "alert alert-danger");
			rq.setAttribute("msg", "Les champs sont vides");
			rq.getRequestDispatcher("index.jsp").forward(rq, rp);
		}
		
		else if(mod.Connection(login, password)) {
			HttpSession ses=rq.getSession();
			ses.setAttribute("prof", mod.getCompt(login).getIdProf());
			rq.getRequestDispatcher("HomeProf.jsp").forward(rq, rp);
		}
		
		
		else {
			rq.setAttribute("style", "alert alert-danger");
			rq.setAttribute("msg", "Mot de passe ou Login est erroné");
			rq.getRequestDispatcher("index.jsp").forward(rq, rp);
		}
	}

}
