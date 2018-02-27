package personaservice.web.rest.service;

import java.util.List;
import java.util.UUID;

import javax.ejb.EJB;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import personaservice.api.ws.LoginParams;
import personaservice.api.ws.User;
import personaservice.api.ws.UserList;
import personaservice.persistence.service.UsersService;

@RestController
public class PersonaServices {

	@EJB(beanName="myUsersService")
	UsersService usersService;
	
	@RequestMapping(value="/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<UserList> getAllUsers(){
		
		String threadId = UUID.randomUUID().toString();
		
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
	
	@RequestMapping(value="/user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<User> getUser(@RequestBody LoginParams loginParams){
		
		String threadId = UUID.randomUUID().toString();
		
		System.out.println("[REST][Thread] # " + threadId + " has started."); 
		
		User user = null;
		
		ResponseEntity<User> reponse = null;
		
		System.out.println("getting record");
		
		user = usersService.getByLogin(loginParams.getLogin(), loginParams.getPassword());
		
		if(user != null){
			reponse = new ResponseEntity<User>(user, HttpStatus.OK);
			System.out.println("It's been gotten the record.");
		}else {
			
			reponse = new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
			
			System.out.println("There was an error to try getting the record.");
			
		}
		
		System.out.println("[REST][Thread] # " + threadId + " has finished.");
		
		return reponse;
		
	}

	
}
