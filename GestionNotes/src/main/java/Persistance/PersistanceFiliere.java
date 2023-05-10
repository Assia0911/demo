package Persistance;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Metier.Etudiant;
import Metier.Filiere;

public class PersistanceFiliere{
	private SessionFactory sessionOf;
	
	
	
	
	public PersistanceFiliere() {
		this.sessionOf=new Configuration().configure().buildSessionFactory();
	}

	public ArrayList<Filiere> getAll(){
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("from Filiere");
		Iterator e=qr.iterate();
		ArrayList <Filiere> liste=new ArrayList();
		while(e.hasNext()) {
			liste.add((Filiere) e.next());
		}
		return liste;
	}
	
	public ArrayList<Filiere> getByNom(String nom){
		Session ses = this.sessionOf.openSession();
		
		Query qr=ses.createQuery("from Filiere where nom=?");
		qr.setParameter(1, nom);
		Iterator e=qr.iterate();
		ArrayList <Filiere> liste=new ArrayList();
		while(e.hasNext()) {
			liste.add((Filiere) e.next());
		}
		return liste;
	}
	
	public Long countNbFiliere() {
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("select count(*) from Filiere");
		return (Long) qr.uniqueResult();
		
	}
	
}
