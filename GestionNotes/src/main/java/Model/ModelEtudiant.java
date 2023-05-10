package Model;

import java.util.ArrayList;

import Metier.Etudiant;
import Metier.ListIterator;
import Persistance.PersistanceEtudiant;

public class ModelEtudiant {
	private PersistanceEtudiant pet;
	private ArrayList<Etudiant> listeet;
	private Etudiant et;
	private Long nb;
	public ModelEtudiant() {
		this.pet= new PersistanceEtudiant();
		this.listeet=new ArrayList<Etudiant>();
		this.getAll();
		this.countEtudiant();
		this.et=new Etudiant();
	}
	
	

	public Etudiant getEt() {
		return et;
	}



	public void setEt(Etudiant et) {
		this.et = et;
	}



	public void setListeet(ArrayList<Etudiant> listeet) {
		this.listeet = listeet;
	}



	public void setNb(Long nb) {
		this.nb = nb;
	}



	public ArrayList<Etudiant> getListeet() {
		return listeet;
	}



	public Long getNb() {
		return nb;
	}





	public void getAll() {
		this.listeet=this.pet.getAll();
	}
	
	public void getByMotCle(String nom){
		this.listeet=this.pet.getByMotCle(nom);
	}
	
	
	
	public void countEtudiant() {
		this.nb=this.pet.countNbEtudiant();
	}
	
	public ArrayList<Float> getListMoy(){
		ArrayList<Float> moys = new ArrayList<>();
		 ListIterator iterator = this.listeet.listIterator();
		 while(iterator.hasNext()) { 
			 moys.add(iterator.getMoyenne());
		 }
		 return moys;
	}
	
	publi
	
	
	
}
