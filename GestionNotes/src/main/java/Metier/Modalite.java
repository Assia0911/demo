package Metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="Modalite")
public class Modalite implements Serializable {
	@Id
	@Column(name="idMod")
	private Integer idMod;
	@ManyToOne
	@JoinColumn(referencedColumnName="idElement")
	private Element idElement;
	@Column
	private String nom;
	@Column
	private Float prct;
	@OneToMany
	private List<Passe> passes;
	
	public Modalite() {
		super();
	}
	public Modalite(Integer idMod, Element idElement, String nom, Float prct) {
		super();
		this.setIdMod(idMod);
		this.setIdElement(idElement);
		this.setNom(nom);
		this.setPrct(prct);
	}

	/*public float getMoyenne() {
		float m=0;
		 ListIterator iterator = this.idElement.passe.listIterator();
		 while(iterator.hasNext()) {
			 m=m+iterator.next().note*iterator.next().idMod.prct;
		 }
		 return m;
	}*/
	
	
	public List<Passe> getEtudiants() {
		return passes;
	}
	public void setEtudiants(List<Passe> etudiants) {
		this.passes = etudiants;
	}
	public Integer getIdMod() {
		return idMod;
	}
	public void setIdMod(Integer idMod) {
		this.idMod = idMod;
	}
	public Element getIdElement() {
		return idElement;
	}
	public void setIdElement(Element idElement) {
		this.idElement = idElement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Float getPrct() {
		return prct;
	}
	public void setPrct(Float prct) {
		this.prct = prct;
	}
	
	
	
	public List<Passe> getPasses() {
		return passes;
	}
	public void setPasses(List<Passe> passes) {
		this.passes = passes;
	}
	@Override
	public String toString() {
		return "Modalite [idMod=" + idMod + ", idElement=" + idElement + ", nom=" + nom + ", prct=" + prct + "]";
	}
	
	
	
}
