package Metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Etudiant")
public class Etudiant implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cne;
	@Column
	private String nom;
	@Column
	private String prenom;
	@OneToMany
	private List <Passe> passe;
	
	public Etudiant() {
		super();
	}
	public Etudiant(Integer cne, String nom, String prenom) {
		super();
		this.setCne(cne);
		this.setNom(nom);
		this.setPrenom(prenom);
	}
	
	public List<Passe> getPasse() {
		return passe;
	}
	public void setPasse(List<Passe> passe) {
		this.passe = passe;
	}
	public Integer getCne() {
		return cne;
	}
	public void setCne(Integer cne) {
		this.cne = cne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public float getMoyenne() {
		float m=0;
		 Iterator iterator = this.passe.listIterator();
		 while(iterator.hasNext()) {
			 m=m+iterator.next().note*iterator.next().idMod.prct;
		 }
		 return m;
	}	
	
	@Override
	public String toString() {
		return "Etudiant [cne=" + cne + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
