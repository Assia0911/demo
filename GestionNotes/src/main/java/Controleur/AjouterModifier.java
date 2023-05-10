package Controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Metier.Compte;
import Model.ModelCompte;
import Model.ModelProfesseur;

@WebServlet("/add")
public class AjouterModifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ModelCompte mc;
    public AjouterModifier() {
        super();
        this.mc=new ModelCompte();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest rq, HttpServletResponse rp) throws ServletException, IOException {
		String login=rq.getParameter("login");
		String password=rq.getParameter("Password");
		String idProf=rq.getParameter("idProf");
		ModelProfesseur pr = new ModelProfesseur();
		Compte cp=new Compte(login,password,pr.trouverProf(Integer.parseInt(idProf)));
		if(mc.getListe().contains(cp)) rq.setAttribute("msg", "le prof a deja un compte");
		else mc.addCompte(cp);
		rq.getRequestDispatcher("liste_compte.jsp").forward(rq, rp);
	}

}
