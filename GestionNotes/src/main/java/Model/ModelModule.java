package Model;
import java.util.*;

import org.hibernate.mapping.Array;

import Metier.Element;
import Metier.Filiere;
import Metier.Module;
import Persistance.PersistanceModule;

public class ModelModule {
	private PersistanceModule pm;
	private ArrayList<Module> listeModules;
	public ArrayList<Module> getListeModules() {
		return listeModules;
	}



	public Long getNbElements() {
		return nbElements;
	}


	public void setNbElements(Long nbElements) {
		this.nbElements = nbElements;
	}


	public Long getNbNotes() {
		return nbNotes;
	}


	public void setNbNotes(Long nbNotes) {
		this.nbNotes = nbNotes;
	}


	public Long getNbModules() {
		return nbModules;
	}


	public void setNbModules(Long nbModules) {
		this.nbModules = nbModules;
	}


	public HashMap<Module, ArrayList<Element>> getMapElement() {
		return mapElement;
	}


	public void setMapElement(HashMap<Module, ArrayList<Element>> mapElement) {
		this.mapElement = mapElement;
	}


	public HashMap<Filiere, Module> getMapFiliere() {
		return mapFiliere;
	}


	public void setMapFiliere(HashMap<Filiere, Module> mapFiliere) {
		this.mapFiliere = mapFiliere;
	}

	private Long nbElements;
	private Long nbNotes;
	private Long nbModules;
	private HashMap<Module,ArrayList<Element>> mapElement;
	private HashMap<Filiere,Module> mapFiliere;
	

	public ModelModule() {
		super();
		this.pm= new PersistanceModule();
		this.getAll();
		this.countNbElements();
		this.countNbModule();
		this.countNbNote();
		//this.mapElement=this.getElementbyModule();
		//this.mapFiliere=this.getFiliere();
		
	}
	
	
	public HashMap<Module,ArrayList<Element>> getElementbyModule(){
		HashMap<Module,ArrayList<Element>> res = new HashMap();
		for(Module m:listeModules) {
			res.put(m, this.pm.getElements(m.getId()));
		}
		return res;	
	}
	
	public HashMap<Filiere,Module> getFiliere(){
		HashMap<Filiere,Module> res=new HashMap<Filiere,Module>();
		for(Module m: listeModules) {
			res.put(this.pm.getFilierebyModule(m), m);
		}
		return res;
	}
	
	public void getAll() {
		this.listeModules= this.pm.getAll();
	}
	
	public void getByNom(String nom){
		this.listeModules= this.pm.getByNom(nom);
	}
	
	public void countNbModule() {
		this.nbModules=this.pm.countNbModule();
	}
	
	public void countNbElements() {
		this.nbElements=this.pm.countNbElement();
	}
	
	public void countNbNote() {
		this.nbNotes=this.pm.countNbNotes();
	}
	
	
}
