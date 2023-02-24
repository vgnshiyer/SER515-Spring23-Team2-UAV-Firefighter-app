import java.util.ArrayList;
import java.util.List;

public class Drone {

	private int ID;

	private int pack_id;

	private String state;

	private List<Person> persons = new ArrayList<Person>();

	public static int state_id;

	// for the purpose of demonstration, we  are using this dummy list with all the valid states
	public List<String> valid_states = new ArrayList<String>();

	public void Drone(int ID, int pack_id) {
		this.ID = ID;
		this.pack_id = pack_id;
	}

	public void changeState() {
		this.state = valid_states.get(state_id); // change state of the drone
		for(Person person : persons){
			person.update(this); // update all the observers
		}
		state_id = (state_id + 1) % valid_states.size();
	}

	public void addPerson(Person person) {
		this.persons.add(person);
	}

	public void removePerson(Person person) {
		this.persons.remove(person);
	}

	public void notifyPerson() {

	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return this.state;
	}
}
