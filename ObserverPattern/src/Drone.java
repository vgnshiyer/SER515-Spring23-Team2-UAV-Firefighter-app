import java.util.ArrayList;
import java.util.List;

public class Drone {

	private int ID;

	private int pack_id;

	private String state;

	private List<Person> persons = new ArrayList<Person>();

	public void Drone(int ID, int pack_id) {
		this.ID = ID;
		this.pack_id = pack_id;
	}

	public void changeState() {

	}

	public void addPerson(Person person) {
		this.persons.add(person);
	}

	public void removePerson(Person person) {
		this.persons.remove(person);
	}

	public void notifyPerson() {
		
	}

}
