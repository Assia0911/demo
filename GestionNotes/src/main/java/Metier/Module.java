package Metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Module")
public class Module implements Serializable{
	@Id
	@Column(name="idModule")
	private Integer id;
	@Column
	private String nom;
	@ManyToOne
	@JoinColumn(referencedColumnName ="idSemestre")
	private Semestre idSemestre;
	@ManyToOne
	private Filiere idFiliere;
	@OneToMany(mappedBy = "codeModule")
	private List<Element> elements;

	public Module() {
		super();
	}
	public Module(Integer id, String nom, Semestre idSemestre,Filiere idFiliere) {
		super();
		this.setId(id);
		this.setNom(nom);
		this.setIdSemestre(idSemestre);
		this.setIdFiliere(idFiliere);
	}
	
	
	public List<Element> getElements() {
		return elements;
	}
	public void setElements(List<Element> elements) {
		this.elements = elements;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Semestre getIdSemestre() {
		return idSemestre;
	}
	
	public void setIdSemestre(Semestre idSemestre) {
		this.idSemestre = idSemestre;
	}
	
	public Filiere getIdFiliere() {
		return idFiliere;
	}
	public void setIdFiliere(Filiere idFiliere) {
		this.idFiliere = idFiliere;
	}
	
	
	
	@Override
	public String toString() {
		return "Module [id=" + id + ", nom=" + nom + ", idSemestre=" + idSemestre + "]";
	}
	
	
}
