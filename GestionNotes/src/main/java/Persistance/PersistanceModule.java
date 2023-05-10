package Persistance;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Metier.Compte;
import Metier.Element;
import Metier.Filiere;
import Metier.Module;

public class PersistanceModule{
	private SessionFactory sessionOf;
	
	
	
	
	public PersistanceModule() {
		this.sessionOf=new Configuration().configure().buildSessionFactory();
	}

	
	
	public ArrayList<Module> getAll(){
		ArrayList <Module> liste=new ArrayList();
		try {
		Session ses = this.sessionOf.openSession();
		Transaction tr=ses.getTransaction();
		tr.begin();
		Query qr=ses.createQuery("from Module");
		liste=(ArrayList<Module>) qr.list();
		tr.commit();
		return liste;
		}catch(Exception e) {
			System.out.println("wala");
		}
		return liste;
	}
	
	public ArrayList<Module> getByNom(String nom){
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("from Module where nom=?");
		qr.setParameter(1, nom);
		Iterator e=qr.iterate();
		ArrayList <Module> liste=new ArrayList();
		while(e.hasNext()) {
			liste.add((Module) e.next());
		}
		ses.close();
		return liste;
	}
	
	public ArrayList<Element> getElements(Integer id){
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("from Element where codeModule=?");
		qr.setParameter(1, id);
		Iterator e=qr.iterate();
		ArrayList <Element> liste=new ArrayList();
		while(e.hasNext()) {
			liste.add((Element) e.next());
		}
		ses.close();
		return liste;
	}
	

	public Filiere getFilierebyModule(Module m){
		Session ses = this.sessionOf.openSession();
		Query qr= ses.createQuery("select * from Filiere where idFiliere=?");
		qr.setParameter(1, m.getIdFiliere());
		return (Filiere) qr.uniqueResult();
	}
	

	
	public Long countNbNotes() {
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("select count(*) from Passe");
		return (Long) qr.uniqueResult();
		
	}
	
	public Long countNbElement() {
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("select count(*) from Element");
		return (Long) qr.uniqueResult();
	}
	
	public Long countNbModule() {
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("select count(*) from Module");
		return (Long) qr.uniqueResult();
		
	}
	
}
