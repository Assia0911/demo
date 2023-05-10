package Persistance;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.cfg.Configuration;

import Metier.Compte;
import Metier.Module;

public class PersistenceCompte{
	private SessionFactory sessionOp;
	
	
	
	
	public PersistenceCompte() {
		this.sessionOp= new Configuration().configure().buildSessionFactory();
	}
	
	public boolean addCompte(Compte cp) {
		Session ses=this.sessionOp.openSession();
		Transaction tr=ses.getTransaction();
		tr.begin();
		try {
		ses.save(cp);
		tr.commit();
		ses.close();
		return true;
		}catch(Exception e) {
			tr.rollback();
			ses.close();
		}
		return false;
	}
	
	
	public boolean delCompte(Compte cp) {
		Session ses=this.sessionOp.openSession();
		Transaction tr=ses.getTransaction();
		tr.begin();
		try {
		ses.delete(cp);;
		tr.commit();
		ses.close();
		return true;
		}catch(Exception e) {
			tr.rollback();
			ses.close();
		}
		return false;
	}
	
	public boolean updateCompte(Compte cp) {
		Session ses=this.sessionOp.openSession();
		boolean p=ses.merge(cp) != null;
		ses.close();
		return p;
	}
	

	public ArrayList<Compte> getAll(){
		ArrayList <Compte> liste= new ArrayList <Compte>();
		try {
			Session ses=this.sessionOp.openSession();
			Transaction tr=ses.getTransaction();
			tr.begin();
			Query qr=ses.createQuery("from Compte");
			liste=(ArrayList<Compte>) qr.list();
			tr.commit();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return liste;
	}
	
	public Compte Connection(String lo){
		Compte cp =new Compte();
		Session ses=this.sessionOp.openSession();
		try {
		cp=(Compte) ses.get(Compte.class,lo);
		}catch(Exception e) {
			return null;
		}
		return cp;
	}
	

	
	
}
