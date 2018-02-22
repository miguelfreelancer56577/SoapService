package personaservice.persistence.imp;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseDao {

	EntityManager entityManager;
	
	@PersistenceContext(unitName = "personaservice-persistence")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;		
	}

}
