
public class NameFinder {
	public static void main(String[] args) throws Exception{
		String id;
		URLReader reader = new URLReader();
		id = reader.getID(); //Stores the users input into the variable 'id'
		System.out.println(reader.getName(id)); //outputs the name of the person who matches the inputed ID
	}

}
