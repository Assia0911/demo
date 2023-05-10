package Model;

import java.util.ArrayList;


import Metier.Compte;
import Persistance.PersistenceCompte;

public class ModelCompte {
	private ArrayList<Compte> liste;
	private PersistenceCompte cpc;
	
	
	
	public ArrayList<Compte> getListe() {
		this.getAll();
		return liste;
	}

	public void setListe(ArrayList<Compte> liste) {
		this.liste = liste;
	}

	public void setCpc(PersistenceCompte cpc) {
		this.cpc = cpc;
	}

	public PersistenceCompte getCpc() {
		return cpc;
	}

	public ModelCompte() {
		this.cpc=new PersistenceCompte();
		this.liste=new ArrayList<Compte>();
		this.getAll();
	}

	public void addCompte(Compte cp) {
		cpc.addCompte(cp);
		this.getAll();
	}
	
	public void delCompte(Compte cp) {
		this.cpc.delCompte(cp);
		this.getAll();
	}
	
	public void updateCompte(Compte cp) {
		this.cpc.updateCompte(cp);
	}
	
	public void getAll() {
		this.liste=this.cpc.getAll();
	}
	
	public boolean Connection(String lo,String pass){
		boolean ok=false;
		if(lo.compareTo("")==0||cpc.Connection(lo)==null) {
			return ok;
		}
		else if(cpc.Connection(lo).getPassword().compareTo(pass)==0) {
			ok=true;
		}
		return ok;
	}
	
	public Compte getCompt(String login) {
		return cpc.Connection(login);
	}
	
	
}
