package Metier;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="Passe")
public class Passe implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
@ManyToOne
@JoinColumn(referencedColumnName="idmod")
private Modalite idmod;

@ManyToOne
@JoinColumn(referencedColumnName="cne")
private Etudiant cne;

@Column
private Float note;
@Column
private Boolean abs;

public Passe() {
	super();
}
public Passe(Modalite idmod, Etudiant cne, Float note, Boolean abs) {
	super();
	this.setAbs(abs);
	this.setCne(cne);
	this.setNote(note);
}
public Modalite getIdmod() {
	return idmod;
}
public void setIdmod(Modalite idmod) {
	this.idmod = idmod;
}
public Etudiant getCne() {
	return cne;
}
public void setCne(Etudiant cne) {
	this.cne = cne;
}
public Float getNote() {
	return note;
}
public void setNote(Float note) {
	if(note>=0&& note<=20)
		this.note = note;
}
public Boolean getAbs() {
	return abs;
}
public void setAbs(Boolean abs) {
	this.abs = abs;
}
@Override
public String toString() {
	return "Passe [idmod=" + idmod + ", cne=" + cne + ", note=" + note + ", abs=" + abs + "]";
}

}
