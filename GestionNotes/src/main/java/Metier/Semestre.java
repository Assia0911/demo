package Metier;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Semestre")
public class Semestre implements Serializable{
@Id
@Column(name="idSemestre")
private Integer idSemestre;




public Semestre() {
	super();
}

public Semestre(Integer idSemestre,Module module) {
	super();
	this.setIdSemestre(idSemestre);
}


public Integer getIdSemestre() {
	return idSemestre;
}

public void setIdSemestre(Integer idSemestre) {
	this.idSemestre = idSemestre;
}



@Override
public String toString() {
	return "Semestre [idSemestre=" + idSemestre + "]";
}

}
