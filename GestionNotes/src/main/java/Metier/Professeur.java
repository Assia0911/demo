package Metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Professeur")

public class Professeur implements Serializable{

	@Id
	@Column(name="idProf")
	private Integer idProf;
	@Column
	private String nom;
	@Column
	private String specialite;
	@Column
	private String prenom;
	@OneToMany(mappedBy ="idProfesseur")
	private List <Element> elements;
	@OneToOne(mappedBy = "idProf")
	private Compte login;
	
	
	
	public Professeur(Integer idProf, String nom, String specialite, String prenom, String login) {
		super();
		this.setIdProf(idProf);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setSpecialite(specialite);

	}
	
	
	public Professeur() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	
	public List<Element> getElements() {
		return elements;
	}


	public void setElements(List<Element> elements) {
		this.elements = elements;
	}


	public Integer getIdProf() {
		return idProf;
	}
	public void setIdProf(Integer idProf) {
		this.idProf = idProf;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

	@Override
	public String toString() {
		return "Professeur [idProf=" + idProf + ", nom=" + nom + ", specialite=" + specialite + ", prenom=" + prenom
				 + "]";
	}
	
	public ArrayList<Element> getElementsValide(){
		ArrayList<Element> el = new ArrayList<Element>();
		for(Element e:this.elements) {
			if(e.getValide()) el.add(e);
		}
		return el;
	}
	
	
	public int getElementsValideNb(){
		int i=0;
		for(Element e:this.elements) {
			if(e.getValide()) i++;
		}
		return i;
	}


	public Compte getLogin() {
		return login;
	}


	public void setLogin(Compte login) {
		this.login = login;
	}
	
	
	
}
