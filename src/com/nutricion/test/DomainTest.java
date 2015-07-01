/**
 * 
 */
package com.nutricion.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nutricion.domain.Cliente;
/**
 * @author brian.nelson.ulloa
 *
 */
public class DomainTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
	    SessionFactory sessionFactory = new
                Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    Transaction tx = null;
	    try {
		     tx = session.beginTransaction();
	
		    Cliente cliente1 =  new Cliente();
		    cliente1.setNombre("Brian");
		    cliente1.setApellido1("Nelson");
		    cliente1.setApellido2("Ulloa");
		    cliente1.setEstiloVida("Sedentario");
		    cliente1.setBebidasAlcoholicas(true);
		    cliente1.setNacionalidad("Costarricense");
		    cliente1.setEdad(31);
		    cliente1.setFumado(false);
		    cliente1.setDietasPrevias("gallo pinto en el desayuno con tostadas, media manana"
		    		+ "jugo de naranja con una manzana, almuerzo casado con carne, en la tarde "
		    		+ "cafe con queque, en la noche casado con pollo, antes de dormir cereal");
		    cliente1.setMetasGimnasio("Bajar la grasa y aumentar masa muscular");
		    session.save(cliente1);
	        
	        tx.commit();
	      }
	      catch (HibernateException e) {
	    	tx.rollback();
	    	e.printStackTrace();
	    
	      } finally {
	    
	        session.close();
	     }
	}

}
