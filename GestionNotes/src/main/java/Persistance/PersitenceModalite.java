package Persistance;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Metier.Compte;
import Metier.Modalite;

public class PersitenceModalite{
	private SessionFactory sessionOp;
	
	public PersitenceModalite() {
		this.sessionOp= new Configuration().configure().buildSessionFactory();
	}

	public ArrayList<Modalite> getAll(){
		Session ses=this.sessionOp.openSession();
		Query qr=ses.createQuery("from Modalite");
		Iterator e=qr.iterate();
		ArrayList <Modalite> liste=new ArrayList();
		while(e.hasNext()) {
			liste.add((Modalite) e);
		}
		ses.close();
		return liste;	}
	
	public ArrayList<Modalite> getByNom(String nom){
		Session ses=this.sessionOp.openSession();
		Query qr=ses.createQuery("from Modalite where nom=?");
		qr.setParameter(1, nom);
		Iterator e=qr.iterate();
		ArrayList <Modalite> liste=new ArrayList();
		while(e.hasNext()) {
			liste.add((Modalite) e);
		}
		ses.close();
		return liste;
	}
	
	
	
	
}
