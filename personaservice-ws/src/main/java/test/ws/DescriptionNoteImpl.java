package test.ws;

import javax.jws.WebService;

import com.mangelt.test.DescriptionNote;
import com.mangelt.test.Employee;
import com.mangelt.test.Note;
import org.apache.log4j.Logger;

@WebService(endpointInterface = "com.mangelt.test.DescriptionNote" , targetNamespace = "http://www.example.org/DescriptionNote/")
public class DescriptionNoteImpl implements DescriptionNote {

	final static Logger logger = Logger.getLogger(DescriptionNoteImpl.class.getName());
	
	@Override
	public Note newOperation(Employee parameters) {
		logger.debug("It is fetching Note object.");
		Note nt = new Note();
		nt.setBody("How are you today.");
		nt.setFrom(parameters.getFirstname() + " " + parameters.getLastname());
		nt.setHeading("Welcome !!!!");
		nt.setTo("Anonymous");
		logger.debug("Record fetched successfully.");
		return nt;
	}

}
