package Metier;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Compte")
public class Compte implements Serializable {
	@Id
	private String login;
	@Column
	private String password;
	@OneToOne
	private Professeur idProf;
	
	
	
	public Professeur getIdProf() {
		return idProf;
	}


	public void setIdProf(Professeur idProf) {
		this.idProf = idProf;
	}


	public Compte() {
		super();
	}


	public Compte(String login, String password,Professeur idProf) {
		super();
		this.login = login;
		this.password = password;
		this.setIdProf(idProf);
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	
	@Override
	public String toString() {
		return "Compte [login=" + login + ", password=" + password + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if(this.idProf.getIdProf().compareTo(((Compte)obj).idProf.getIdProf())==0) return true;
		return false;
	}
	
	
	
	
	
}
