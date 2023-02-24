public abstract class Person {

	private int ID;

	public abstract void update(Drone drone);

	void setID(int ID){
		this.ID = ID;
	}

	int getID(){
		return this.ID;
	}
}
