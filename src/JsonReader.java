
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;
public class JsonReader {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader f = new FileReader("F:\\Spring Boot workspace/JavaCoding/src/test.json");
		 JSONParser parser = new JSONParser();
		 JSONObject jo =  (JSONObject)parser.parse(f);
		 System.out.println(jo.get("name"));
	}

}
