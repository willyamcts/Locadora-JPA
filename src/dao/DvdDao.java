package dao;

import javax.persistence.EntityManager;

import jpa.ConnectionFactory;
import model.Dvd;

public class DvdDao {

	private EntityManager em = new ConnectionFactory().getEntityManager();
	
	
	public void salva(Dvd dvd) {		
		
		try {
			em.getTransaction().begin();
			em.persist(dvd);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println("Erro: " +e);;
		} finally {
			em.close();
		}
		
	}
	
	
	public void remove(int id) {
		Dvd dvd = null;
		
		try {
			dvd = em.find(Dvd.class, id);
			if ( dvd != null ){
				em.getTransaction().begin();
				em.remove(dvd);
				em.getTransaction().commit();
			} else {
				System.out.println("\t Id " +id+ " de dvd n�o encontrado...");
			}
			
		} catch (Exception e) {
			System.err.println("Erro: " +e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		
		
	}
	
	
}
