package test.ws;

import javax.jws.WebService;

import com.mangelt.test.DescriptionNote;
import com.mangelt.test.Note;

@WebService(endpointInterface = "com.mangelt.test.DescriptionNote" , targetNamespace = "http://www.example.org/DescriptionNote/")
public class DescriptionNoteImpl implements DescriptionNote {

	@Override
	public Note newOperation(Note parameters) {
		Note nt = new Note();
		nt.setBody("Hi!, how are you today.");
		nt.setFrom("Me....");
		nt.setHeading("Welcome!");
		nt.setTo("Anonymous");
		return nt;
	}

}
