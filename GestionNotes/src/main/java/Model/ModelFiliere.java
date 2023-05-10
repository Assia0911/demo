package Model;

import java.util.ArrayList;

import Metier.Filiere;
import Persistance.PersistanceFiliere;

public class ModelFiliere {
	private PersistanceFiliere pf;
	private ArrayList<Filiere> listeFiliere;
	private Long nb;
	
	
	public ModelFiliere() {
		this.pf=new PersistanceFiliere();
		this.getAll();
		this.countNbFiliere();
	}
	
	public ArrayList<Filiere> getListFiliere() {
		return listeFiliere;
	}
	public void getAll() {
		this.listeFiliere=pf.getAll();
	}
	
	public void getByNom(String nom)
	{
		this.listeFiliere=pf.getByNom(nom);
	}
	
	public void countNbFiliere() {
		this.nb=this.pf.countNbFiliere();
	}
	public Long getNb() {
		return nb;
	}

	public ArrayList<Filiere> getListeFiliere() {
		return listeFiliere;
	}

	public void setListeFiliere(ArrayList<Filiere> listeFiliere) {
		this.listeFiliere = listeFiliere;
	}

	public void setNb(Long nb) {
		this.nb = nb;
	}
	
}
