import java.net.*;
import java.io.*;

public class URLReader {
	
 String getID() throws Exception{ //Returns user input from console
		System.out.print("Enter ID:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		return in.readLine();
	}
 
	public String getName(String id) throws Exception { //Finds the name of the person assosiated with the given ID
		String name;
		URL address = new URL("http://www.ecs.soton.ac.uk/people/" + id);
		BufferedReader in2 = new BufferedReader(new InputStreamReader(address.openStream()));
		while((name = in2.readLine()) != null) {
			if(name.contains("<title>")) {
				break;
			}
		}
		in2.close();
		name = name.substring(11, name.indexOf('|')-1);
		return name;
	}
}