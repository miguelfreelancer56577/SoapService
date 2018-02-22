package personaservice.persistence.service;

import java.util.List;

import javax.ejb.Local;

import personaservice.model.domain.Users;

@Local
public interface UsersService {

	List<Users> getAllusers();
	
	Users getById();
	
	Users getByLogin(); 
	
}
