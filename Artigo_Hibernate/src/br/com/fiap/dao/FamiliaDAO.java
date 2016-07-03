package br.com.fiap.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.fiap.entity.Familia;



public class FamiliaDAO {

	 private SessionFactory factory; 

	   

	       @SuppressWarnings("deprecation")
		public FamiliaDAO() throws Exception{ 

	         factory = new org.hibernate.cfg.Configuration().addClass(Familia.class).buildSessionFactory(); 

	     }      

	   

	     public void insert(Familia familia) throws Exception{ 

	       Session session = factory.openSession(); 

	       session.save(familia); 

	       session.flush(); 

	         session.close(); 

	     } 

	     
/*
	     public java.util.List getList(String condicao) throws Exception{ 

	        Session session = factory.openSession(); 

	         List amigos = session.fin(condicao); 

	        session.flush(); 

	         session.close(); 

	        return amigos; 

	     } 
*/
	       

	     public Familia retrieve(String pk) throws Exception{ 

	        Session session = factory.openSession(); 

	        Familia familia = (Familia)session.load(Familia.class, pk); 

	        session.flush(); 

	        session.close(); 

	        return familia; 

	      } 

	        

	     public void delete(Familia familia) throws Exception{ 

	       Session session = factory.openSession(); 

	      session.delete(familia); 

	       session.flush(); 

	         session.close(); 

	    } 

	 } 
	

