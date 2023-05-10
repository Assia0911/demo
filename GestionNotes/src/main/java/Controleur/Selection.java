package Controleur;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Metier.Element;
import Metier.Professeur;
@WebServlet("/select")
public class Selection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest rq, HttpServletResponse response) throws ServletException, IOException {
		int idElement=Integer.parseInt(rq.getParameter("id"));
		Element el= new Element(idElement, null, null, null, null, false);
		List <Element> liste=((Professeur) rq.getAttribute("prof")).getElements();
		int i = liste.indexOf(el);
		rq.setAttribute("element", liste.get(i));
	
	}

}
