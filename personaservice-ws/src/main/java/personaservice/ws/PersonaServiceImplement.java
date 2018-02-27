package personaservice.ws;

import java.util.List;
import java.util.UUID;

import javax.ejb.EJB;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import personaservice.api.ws.LoginParams;
import personaservice.api.ws.PersonaService;
import personaservice.api.ws.User;
import personaservice.api.ws.UserList;
import personaservice.persistence.service.UsersService;
import test.ws.DescriptionNoteImpl;

@WebService(endpointInterface="personaservice.api.ws.PersonaService", targetNamespace="http:/walmart.com.mx/PersonaService/")
public class PersonaServiceImplement implements PersonaService {

	final static Logger logger = Logger.getLogger(PersonaServiceImplement.class.getName());
	
	@EJB
	UsersService usersService;
	
	@Override
	public UserList getAllUsers() {
		
		String threadId = UUID.randomUUID().toString();
		
		logger.info("[SOAP][Thread] # " + threadId + " has started."); 
		
		UserList userList = null;
		
		logger.info("getting all users");
		
		List<User> users = usersService.getAllusers();
		
		if(users != null){
			userList = new UserList();
			userList.setUsers(users);
		}
		
		logger.info("It's been gotten all records.");
		
		logger.info("[SOAP][Thread] # " + threadId + " has finished.");
		
		return userList;
	}
	
	@Override
	public User getUserLogin(LoginParams loginParams){
		
		String threadId = UUID.randomUUID().toString();
		
		logger.info("[SOAP][Thread] # " + threadId + " has started."); 
		
		User user = usersService.getByLogin(loginParams.getLogin(), loginParams.getPassword());
		
		logger.info("It's been found one record.");
		
		logger.info("[SOAP][Thread] # " + threadId + " has finished.");
		
		return user;
	}

}
