package Persistance;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Metier.Etudiant;
import Metier.Passe;

public class PersistanceEtudiant {
	private SessionFactory sessionOp;
	
	public PersistanceEtudiant() {
		this.sessionOp=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public ArrayList <Etudiant> getAll(){
		Session ses=this.sessionOp.openSession();
		Query qr=ses.createQuery("from Etudiant"); 
		Iterator e=qr.iterate();
		ArrayList <Etudiant> liste=new ArrayList();
		while(e.hasNext()) {
			liste.add((Etudiant) e.next());
		}
		return liste;
	}
	
	public ArrayList<Etudiant> getByMotCle(String nom){
		Session ses=this.sessionOp.openSession();
		Query qr=ses.createQuery("from Etudiant where nom=? or prenom=? or cne=?");
		qr.setParameter(1, nom);
		qr.setParameter(2, nom);
		qr.setParameter(3, Integer.parseInt(nom));
		Iterator e=qr.iterate();
		ArrayList <Etudiant> liste=new ArrayList();
		while(e.hasNext()) {
			liste.add((Etudiant) e);
		}
		return liste;
	}
	
	public boolean insertNotes(Passe p) {
		Session ses=this.sessionOp.openSession();
		Transaction tr=ses.getTransaction();
		tr.begin();
		try {
			ses.save(p);
			tr.commit();
			ses.close();
			return true;
			}catch(Exception e) {
				tr.rollback();
				ses.close();
			}
			return false;
	}
	
	public Long countNbEtudiant() {
		Session ses=this.sessionOp.openSession();
		Query qr=ses.createQuery("select count(*) from Professeur");
		return (Long) qr.uniqueResult();
		
	}
}
