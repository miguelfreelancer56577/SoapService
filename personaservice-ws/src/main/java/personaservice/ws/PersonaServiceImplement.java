package personaservice.ws;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import personaservice.api.ws.PersonaService;
import personaservice.api.ws.User;
import personaservice.persistence.service.UsersService;
import test.ws.DescriptionNoteImpl;

@WebService(endpointInterface="personaservice.api.ws.PersonaService", targetNamespace="http:/walmart.com.mx/PersonaService/")
public class PersonaServiceImplement implements PersonaService {

	final static Logger logger = Logger.getLogger(PersonaServiceImplement.class.getName());
	
	@EJB
	UsersService usersService;
	
	@Override
	public User getAllUsers() {
		
		logger.info("getting all users");
		
		List<User> users = usersService.getAllusers();
		
		logger.info("It's been gotten all records.");
		
		return null;
	}

}
