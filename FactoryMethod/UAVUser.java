import java.util.List;
public interface UAVUser {

	private int id;

	private List acl;

	public void notify();

	public abstract void connectDrones();

	public abstract void monitorHealth();

}
