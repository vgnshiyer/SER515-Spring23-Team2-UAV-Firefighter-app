// The invoker class (pilot)

public class Pilot {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void executeCommand() {
		command.execute();
	}

}
