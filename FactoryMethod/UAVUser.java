public interface UAVUser {

	private ID id;

	public void notify();

	public abstract void connectDrones();

	public abstract void monitorHealth();

}
