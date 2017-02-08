package test.ws;

import javax.jws.WebService;

import com.mangelt.test.DescriptionNote;
import com.mangelt.test.Employee;
import com.mangelt.test.Note;

@WebService(endpointInterface = "com.mangelt.test.DescriptionNote" , targetNamespace = "http://www.example.org/DescriptionNote/")
public class DescriptionNoteImpl implements DescriptionNote {

	@Override
	public Note newOperation(Employee parameters) {
		Note nt = new Note();
		nt.setBody("How are you today.");
		nt.setFrom(parameters.getFirstname() + " " + parameters.getLastname());
		nt.setHeading("Welcome !!!!");
		nt.setTo("Anonymous");
		return nt;
	}

}
