public class UAV {

	private String wingType;

	private String flightEndurance;

	private String size;

	private int weightCapacity;

	private int batteryPower;

	private String otherFeatures;

	private int ID;

	private int pack_id;

	/**
	 *  
	 */
	public void UAV(UAV.UAVBuilder uavBuilder) {

	}

	public class UAVBuilder {

		private String wingType;

		private String size;

		private String flightEndurance;

		private Integer weightCapacity;

		private Integer batteryPower;

		private String otherFeatures;

		private int ID;

		private int pack_id;

		/**
		 *  
		 */
		public void UavBuilder(int ID, int pack_id) {

		}

		public int setWingType(String wingType) {
			return 0;
		}

		/**
		 *  
		 */
		public int setFlightEndurance(String flightEndurance) {
			return 0;
		}

		/**
		 *  
		 */
		public int setWeightCapacity(int weightCapacity) {
			return 0;
		}

		/**
		 *  
		 */
		public int setBatteryPower(int batteryPower) {
			return 0;
		}

		public int setOtherFeatures(String otherFeatures) {
			return 0;
		}

		public UAV setSize(int size) {
			return null;
		}

		public UAV build() {
			return null;
		}

	}

}
