package Persistance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Metier.Compte;
import Metier.Element;
import Metier.Module;
import Metier.Professeur;

public class PersistanceProfesseur{
	private SessionFactory sessionOf;
	
	public PersistanceProfesseur() {
		this.sessionOf=new Configuration().configure().buildSessionFactory();
	}

	public ArrayList<Professeur> getAll(){
		ArrayList <Professeur> liste=new ArrayList();
		try {
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("from Professeur");
		liste=(ArrayList<Professeur>) qr.list();
		ses.close();
		return liste;
		}catch(Exception e) {
			System.out.println("walo");
		}
		return liste;
	}
	
	
	public ArrayList<Professeur> getByMotCle(String nom){
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("from Professeur where nom LIKE ? or prenom LIKE ?");
		qr.setParameter(0, "%"+nom+"%");
		qr.setParameter(1, "%"+nom+"%");
		List <Professeur> liste=qr.list();
		return (ArrayList<Professeur>) liste;
	}
	
	public Professeur trouverProf(Integer id) {
		Session ses = this.sessionOf.openSession();
		return (Professeur)ses.load(Professeur.class, id);
	}
	
	
	
	public void insertElement(Element e) {
		Session ses = this.sessionOf.openSession();
		ses.save(e);
		ses.close();
	}
	
	public Long countNbProfesseur() {
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("select count(*) from Professeur");
		return (Long) qr.uniqueResult();
	}
	public String getCompte(Professeur pr) {
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("from Compte where idProf=? ");
		qr.setParameter(1, pr);
		return ((Compte) qr.uniqueResult()).getLogin();
	}
	

	
}
