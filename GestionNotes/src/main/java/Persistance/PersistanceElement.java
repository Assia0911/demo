package Persistance;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Metier.Element;

public class PersistanceElement {
private SessionFactory sessionOf;
	
	
	
	
	public PersistanceElement() {
		this.sessionOf=new Configuration().configure().buildSessionFactory();
	}
	
	public ArrayList<Element> getAll(){
		ArrayList <Element> liste=new ArrayList<Element>();
		try {
		Session ses = this.sessionOf.openSession();
		Transaction tr=ses.getTransaction();
		tr.begin();
		Query qr=ses.createQuery("from Element");
		liste=(ArrayList<Element>) qr.list();
		tr.commit();
		return liste;
		}catch(Exception e) {
			System.out.println("wala");
		}
		return liste;
	}
	
	public int getElementsValide(){
		ArrayList <Element> liste=new ArrayList<Element>();
		try {
		Session ses = this.sessionOf.openSession();
		Query qr=ses.createQuery("from Element where valide=true");
		liste=(ArrayList<Element>) qr.list();
		return liste.size();
		}catch(Exception e) {
			System.out.println("wala");
		}
		return liste.size();
	}
}
