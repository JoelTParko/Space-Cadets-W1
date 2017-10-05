import java.net.*;
import java.io.*;
public class URLReader {

	public static void main(String[] args) throws Exception {
		String urlString = "http://www.ecs.soton.ac.uk/people/";
		//String urlString = "https://secure.ecs.soton.ac.uk/people/";
		int count = 1;
		int endPosition;
		//Reading from the console
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputLine;
		String name;
		inputLine = in.readLine();
		
		in.close();
		//Reading from a URL
		URL address = new URL(urlString + inputLine);
		BufferedReader in2 = new BufferedReader(new InputStreamReader(address.openStream()));
		while((inputLine = in2.readLine()) != null && count < 9) {
			count++;
		}
		in2.close();

		name = inputLine.substring(11);
		
		endPosition = name.indexOf("|");
		name = name.substring(0, endPosition);
		System.out.println(name);
	}
	

}