package personaservice.persistence.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.walmart.homero.logger.Logger;
import com.walmart.homero.logger.LoggerFactory;

import personaservice.model.domain.Users;
import personaservice.persistence.service.UsersService;

@Stateless
public class UsersServiceImplement implements UsersService {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("personaservice-persistence");
	
	EntityManager entityManager;
	
	@Override
	public List<Users> getAllusers() {
		
		entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Query query = entityManager.createNamedQuery("Users.findAll");
		
		List<Users> users = null;
		
	    try {
	    	users = query.getResultList();
	    } catch (NoResultException e) {
	    }finally{
	    	
	    	entityManager.getTransaction().commit();
			
			entityManager.close();
			
	    }
	    
		return users;
	}

	@Override
	public Users getById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getByLogin() {
		// TODO Auto-generated method stub
		return null;
	}

}
