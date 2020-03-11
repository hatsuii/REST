package eu.ensup.rest2json;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Lanceur {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();

		File resultFile = new File("employe.json");

		List<Employe> empls = mapper.readValue(resultFile, List.class);

		System.out.println(empls);
	}

	public static void writejson() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		File resultFile = new File("employe.json");
		Employe empl = new Employe("jacksons", "richardson");
		mapper.writeValue(resultFile, empl);
	}

	public static void readjson() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		File resultFile = new File("employe.json");
		// mapper.writeValue(resultFile, empl);
		Employe empl = mapper.readValue(resultFile, Employe.class);
		System.out.println(empl.toString());
	}

	public static void readjsonlist() throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		File resultFile = new File("employe.json");

		List<Employe> empls = mapper.readValue(resultFile, List.class);

		System.out.println(empls);
	}
}
