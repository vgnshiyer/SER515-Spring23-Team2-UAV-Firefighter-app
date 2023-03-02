public abstract class Person {

	private int ID;

	public abstract void update(Drone drone);

	public Person(int ID){
		this.ID = ID;
	}

	public void setID(int ID){
		this.ID = ID;
	}

	public int getID(){
		return this.ID;
	}
}
