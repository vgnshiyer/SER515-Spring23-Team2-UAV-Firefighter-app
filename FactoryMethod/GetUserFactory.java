import java.util.List;

public class GetUserFactory {

	public UAVUser getUser(String userType) {
		if(userType==null) {
			return null;
		}

		if(userType.equalsIgnoreCase("SUPERADMIN")) {
			return new SuperAdmin();
		}

		else if(userType.equalsIgnoreCase("PILOT")) {
			return new Pilot();
		}

		else if(userType.equalsIgnoreCase("OPERATOR")) {
			return new Operator();
		}

		return null;
		
	}

}
