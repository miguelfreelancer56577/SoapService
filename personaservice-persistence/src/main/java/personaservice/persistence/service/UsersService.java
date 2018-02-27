package personaservice.persistence.service;

import java.util.List;

import javax.ejb.Local;

import personaservice.api.ws.User;

@Local
public interface UsersService {

	List<User> getAllusers();
	
	User getById();
	
	User getByLogin(String login, String password); 
	
}
