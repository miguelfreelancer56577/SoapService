package personaservice.web.rest.service;

import java.util.List;

import javax.ejb.EJB;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import personaservice.api.ws.User;
import personaservice.api.ws.UserList;
import personaservice.persistence.service.UsersService;

@RestController
public class PersonaServices {

	@EJB(beanName="myUsersService")
	UsersService usersService;
	
	@RequestMapping(value="/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<UserList> getAllUsers(){
		
		long threadId = Thread.currentThread().getId();
		
		System.out.println("[REST][Thread] # " + threadId + " has started."); 
		
		ResponseEntity<UserList> reponse = null;
		
		UserList userList = null;
		
		System.out.println("getting records");
		
		List<User> users = usersService.getAllusers();
		
		if(users != null){
			userList = new UserList();
			userList.setUsers(users);
			reponse = new ResponseEntity<UserList>(userList, HttpStatus.OK);
		}
		
		System.out.println("It's been gotten all records.");
		
		System.out.println("[REST][Thread] # " + threadId + " has finished.");
		
		return reponse;
		
	}
	
}
