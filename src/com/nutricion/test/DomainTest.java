/**
 * 
 */
package com.nutricion.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nutricion.domain.AlimentacionEvaluar;
import com.nutricion.domain.Cliente;
import com.nutricion.domain.HistoriaClinicaFamiliar;
import com.nutricion.domain.HistoriaClinicaPersonal;
import com.nutricion.domain.Telefono;
import com.nutricion.domain.ValoracionDietetica;
/**
 * @author brian.nelson.ulloa
 *
 */
public class DomainTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
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
		    cliente1.setDietasPrevias("gallo pinto en el desayuno con tostadas, media manana "
		    		+ "jugo de naranja con una manzana, almuerzo casado con carne, en la tarde "
		    		+ "cafe con queque, en la noche casado con pollo, antes de dormir cereal");
		    cliente1.setMetasGimnasio("Bajar la grasa y aumentar masa muscular");
		    
		    //Telefonos
		    Telefono telefono1 = new Telefono();
		    telefono1.setNumeroTelefonico("25564833");
		   
		    Telefono telefono2 = new Telefono();
		    telefono2.setNumeroTelefonico("87103425");
		   
		    //Alimentacion a Evaluar
		    AlimentacionEvaluar alimentacionEvaluar = new AlimentacionEvaluar();
		    alimentacionEvaluar.setDesayuno("pinto con huevo");
		    alimentacionEvaluar.setMeriendaManana("galletas integrales");
		    alimentacionEvaluar.setAlmuerzo("casado con carne");
		    alimentacionEvaluar.setCena("casado con pollo");
		    alimentacionEvaluar.setMeriendaTarde("yogourt con una manzana");
		    alimentacionEvaluar.setCoalicionNocturna("cereal integral");
		    alimentacionEvaluar.setComidasRapidas("3 veces a la semana");
		    alimentacionEvaluar.setHidratacion("tomo 8 vasos de agua al dia");
		    alimentacionEvaluar.setCliente(cliente1);//asignar al cliente
		    
		    HistoriaClinicaFamiliar historiaClinicaFamiliar = new HistoriaClinicaFamiliar();
		    historiaClinicaFamiliar.setCa(false);
		    historiaClinicaFamiliar.setDislipidemia(false);
		    historiaClinicaFamiliar.setDm(false);
		    historiaClinicaFamiliar.setEpilepsia(false);
		    historiaClinicaFamiliar.setHta(false);
		    historiaClinicaFamiliar.setObesidad(false);
		    historiaClinicaFamiliar.setOsteoporosis(false);
		    historiaClinicaFamiliar.setProblemasCardiovasculares(false);
		    historiaClinicaFamiliar.setDm(false);
		    historiaClinicaFamiliar.setTiroides(false);
		    historiaClinicaFamiliar.setCliente(cliente1);//asignar al cliente
		    
		    HistoriaClinicaPersonal historiaClinicaPersonal = new HistoriaClinicaPersonal();
		    historiaClinicaPersonal.setAcidoUrico(false);
		    historiaClinicaPersonal.setAlergias(false);
		    historiaClinicaPersonal.setAlergiasIntolerancias(false);
		    historiaClinicaPersonal.setAnsiedad(false);
		    historiaClinicaPersonal.setApnea(false);
		    historiaClinicaPersonal.setAudicion(false);
		    historiaClinicaPersonal.setCa(false);
		    historiaClinicaPersonal.setCansancio(false);
		    historiaClinicaPersonal.setCefaleas(false);
		    historiaClinicaPersonal.setCiclosMenstruales(false);
		    historiaClinicaPersonal.setCirculatorios(false);
		    historiaClinicaPersonal.setColitis(false);
		    historiaClinicaPersonal.setCutaneos(false);
		    historiaClinicaPersonal.setCx(false);
		    historiaClinicaPersonal.setDerrames(false);
		    historiaClinicaPersonal.setDiarreas(false);
		    historiaClinicaPersonal.setDislipidemia(false);
		    historiaClinicaPersonal.setDm(false);
		    historiaClinicaPersonal.setEstrenimiento(false);
		    historiaClinicaPersonal.setEstres(false);
		    historiaClinicaPersonal.setFibromialgias(false);
		    historiaClinicaPersonal.setGastritis(false);
		    historiaClinicaPersonal.setHdl(false);
		    historiaClinicaPersonal.setHemorroides(false);
		    historiaClinicaPersonal.setHerniaHiatal(false);
		    historiaClinicaPersonal.setHigado(false);
		    historiaClinicaPersonal.setHta(false);
		    historiaClinicaPersonal.setInsomnio(false);
		    historiaClinicaPersonal.setMetCHO(false);
		    historiaClinicaPersonal.setMialgias(false);
		    historiaClinicaPersonal.setOb(false);
		    historiaClinicaPersonal.setOlfato(false);
		    historiaClinicaPersonal.setOseos(false);
		    historiaClinicaPersonal.setRetieneLiquidos(false);
		    historiaClinicaPersonal.setRinones(false);
		    historiaClinicaPersonal.setRonca(false);
		    historiaClinicaPersonal.setScv(false);
		    historiaClinicaPersonal.setTgi(false);
		    historiaClinicaPersonal.setTiroides(false);
		    historiaClinicaPersonal.setVarices(false);
		    historiaClinicaPersonal.setVision(false);
		    historiaClinicaPersonal.setCliente(cliente1);//asignar al cliente
		    
		    ValoracionDietetica valoracionDietetica = new ValoracionDietetica();
		    valoracionDietetica.setAlimentosPreferidos("pizza con peperoni");
		    valoracionDietetica.setAlimentosQueNoConsume("frutas acidas");
		    valoracionDietetica.setPreparadorDeAlimentos("Empleada Domestica");
		    valoracionDietetica.setCliente(cliente1);//asignar al cliente
		    
		    //asignar los objetos al cliente
		    cliente1.setAlimentacionEvaluar(alimentacionEvaluar);
		    cliente1.setHistoriaClinicaFamiliar(historiaClinicaFamiliar);
		    cliente1.setHistoriaClinicaPersonal(historiaClinicaPersonal);
		    cliente1.setValoracionDietetica(valoracionDietetica);
		    cliente1.getTelefonos().add(telefono1);
		    cliente1.getTelefonos().add(telefono2);
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
