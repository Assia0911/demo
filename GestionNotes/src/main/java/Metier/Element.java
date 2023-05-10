package Metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Element")
public class Element implements Serializable{
	@Id
	@Column(name="idElement")
	private Integer idElement;
	@ManyToOne
	@JoinColumn
	private Professeur idProfesseur;
	@ManyToOne
	private Module codeModule;
	@Column
	private String nom;
	@Column
	private Float coffecient;
	@Column
	private boolean valide;
	@OneToMany
	private List <Modalite> modalites; 
	
	
	public Element() {
		super();
	}


	public Element(Integer idElement, Professeur idProfesseur, Module codeModule, String nom, Float coffecient,boolean valide) {
		super();
		this.setIdElement(idElement);
		this.setIdProfesseur(idProfesseur);
		this.setCodeModule(codeModule);
		this.setNom(nom);
		this.setCoffecient(coffecient);
		this.valide=valide;
	}

	
	

	public boolean getValide() {
		return valide;
	}


	public void setValide(boolean valide) {
		this.valide = valide;
	}


	public List<Modalite> getModalites() {
		return modalites;
	}


	public void setModalites(List<Modalite> modalites) {
		this.modalites = modalites;
	}


	public Integer getIdElement() {
		return idElement;
	}


	public void setIdElement(Integer idElement) {
		this.idElement = idElement;
	}


	public Professeur getIdProfesseur() {
		return idProfesseur;
	}


	public void setIdProfesseur(Professeur idProfesseur) {
		this.idProfesseur = idProfesseur;
	}


	public Module getCodeModule() {
		return codeModule;
	}


	public void setCodeModule(Module codeModule) {
		this.codeModule = codeModule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Float getCoffecient() {
		return coffecient;
	}


	public void setCoffecient(Float coffecient) {
		this.coffecient = coffecient;
	}


	
	@Override
	public String toString() {
		return "Element [idElement=" + idElement + ", idProfesseur=" + idProfesseur + ", codeModule=" + codeModule
				+ ", nom=" + nom + ", coffecient=" + coffecient + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if(this.idElement==((Element)obj).idElement) return true;
		return false;
	}
	
	
	
	
}
