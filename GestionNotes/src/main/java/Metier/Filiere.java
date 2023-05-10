package Metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="Filiere")
public class Filiere implements Serializable{
	@Id
	@Column(name="idFiliere")
	private Integer idFiliere;
	@Column
	private String nom;	
	@OneToMany(mappedBy = "idFiliere")
	private List<Module> modules;
	public Filiere() {
		super();
	}
	public Filiere(Integer idFiliere, String nom) {
		super();
		this.setIdFiliere(idFiliere);
		this.setNom(nom);
	}
	public Integer getIdFiliere() {
		return idFiliere;
	}
	public void setIdFiliere(Integer idFiliere) {
		this.idFiliere = idFiliere;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	@Override
	public String toString() {
		return "Filiere [idFiliere=" + idFiliere + ", nom=" + nom + "]";
	}
	
	
}
