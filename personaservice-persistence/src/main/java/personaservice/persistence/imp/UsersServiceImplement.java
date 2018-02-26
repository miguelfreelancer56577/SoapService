package personaservice.persistence.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import personaservice.api.ws.User;
import personaservice.persistence.service.UsersService;

@Stateless
public class UsersServiceImplement implements UsersService {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("personaservice-persistence");
	
	EntityManager entityManager;
	
	@Override
	public List<User> getAllusers() {
		
		entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Query query = entityManager.createNamedQuery("User.findAll");
		
		List<User> users = null;
		
	    try {
	    	users = query.getResultList();
	    } catch (NoResultException e) {
	    }finally{
	    	
	    	entityManager.getTransaction().commit();
			
//			entityManager.close();
			
	    }
	    
		return users;
	}

	@Override
	public User getById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByLogin() {
		// TODO Auto-generated method stub
		return null;
	}

}
