package Model;

import java.util.ArrayList;
import java.util.HashMap;
import Metier.Compte;
import Metier.Element;
import Metier.Professeur;
import Persistance.PersistanceProfesseur;

public class ModelProfesseur {
	private ArrayList<Professeur> listeProf;
	private PersistanceProfesseur ppf;
	private Long nb;
	private String login;
	
	
	public ModelProfesseur() {
		super();
		this.ppf =new PersistanceProfesseur();
		
		this.countNbProfesseur();
	}
	public ArrayList<Professeur> getListeProf() {
		
		return listeProf;
	}
	public void setListeProf(ArrayList<Professeur> listeProf) {
		this.listeProf = listeProf;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setNb(Long nb) {
		this.nb = nb;
	}
	public ArrayList<Professeur> getListProf() {
		return listeProf;
	}
	
	public void getAll() {
		this.listeProf = ppf.getAll();
	}
	
	public Long getNb() {
		return nb;
	}
	
	public ArrayList<Professeur> getByMotCle(String mc) {
		return ppf.getByMotCle(mc); 
	}
	
	public void countNbProfesseur() {
		this.nb=this.ppf.countNbProfesseur();
	}
	
	
	
	public void insertElement(Element e) {
		this.ppf.insertElement(e);
	}
	
	public void getLoginProf(Professeur pr) {
		this.login=this.ppf.getCompte(pr);
	}
	
	public Professeur trouverProf(Integer id) {
		return this.ppf.trouverProf(id);
	}
	
	
	
	
	
	
}
