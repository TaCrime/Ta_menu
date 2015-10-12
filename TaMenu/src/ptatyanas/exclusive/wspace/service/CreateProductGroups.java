package ptatyanas.exclusive.wspace.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ptatyanas.exclusive.wspace.entity.ProductGroups;

public class CreateProductGroups {
	
	   public static void main( String[ ] args ) {
		   
		   EntityManagerFactory factory = Persistence.createEntityManagerFactory("TaMenu");
		   EntityManager entityManager = factory.createEntityManager();
		   entityManager.getTransaction().begin();
		   
		   for (String groupName: new String[]{"Meat", "Fish", "Vegetables", "Cereals", "Fruits"}) {
			   ProductGroups productGroup = new  ProductGroups();  
			   productGroup.setProductName(groupName);
			   entityManager.persist(productGroup);
		   }
		   
		   entityManager.getTransaction().commit();
		   entityManager.close();
		   factory.close();
		   
	   }


}
