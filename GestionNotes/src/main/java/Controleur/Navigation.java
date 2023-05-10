package Controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ModelEtudiant;

@WebServlet("/nav")
public class Navigation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Navigation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest rq, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(rq.getAttribute("prof")!=null) {
		rq.getSession().removeAttribute("prof");
		}
		if(rq.getAttribute("nom")!=null) {
			rq.getSession().removeAttribute("nom");
		}
		rq.getRequestDispatcher("index.jsp").forward(rq, response);
	}

}
