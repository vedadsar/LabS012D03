import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;


public class TestClass {
	public static void main(String[] args) {
		Person vedad = new Person("Vedad", "Zornic");
		Person mustafa = new Person("Mustafa", "Ademovic");
		Person emir = new Person("Emir", "Imamovic");
		Person gordan = new Person("Gordan", "Sajevic");
		Person benjo = new Person("Benjamin", "Talic");
		
		vedad.addChild(new Person("Junior Vedad", "Zornic"));
		vedad.addChild(new Person("Emina", "Muratovic"));		
		emir.addChild(new Person("Hikmet", "Durgutovic"));
		emir.addChild(new Person("Saban", "Saulic"));
		benjo.addChild(new Person("Bitcamp", "Nesto"));
		
		LinkedList<Person> people = new LinkedList<Person>();
		people.add(benjo);
		people.add(emir);
		people.add(vedad);
		people.add(gordan);
		people.add(mustafa);
		
		//System.out.println(people.toString());
		
		
		
		try {
			Person.personToXML(people, new FileOutputStream("./XML/people.xml"));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
