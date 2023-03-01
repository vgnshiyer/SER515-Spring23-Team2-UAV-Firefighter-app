public class UAV {

	private final String wingType;
	private final String flightEndurance;
	private final String size;
	private final int weightCapacity;
	private final int batteryPower;
	private final String otherFeatures;
	private final int ID;
	private final int pack_id;

    private UAV(UAV.UAVBuilder uavBuilder) {
        this.wingType = uavBuilder.wingType;
        this.flightEndurance = uavBuilder.flightEndurance;
        this.size = uavBuilder.size;
        this.weightCapacity = uavBuilder.weightCapacity;
        this.batteryPower = uavBuilder.batteryPower;
        this.otherFeatures = uavBuilder.otherFeatures;
        this.ID = uavBuilder.ID;
        this.pack_id = uavBuilder.pack_id;
	}

	public static class UAVBuilder {

		private String wingType;
		private String size;
		private String flightEndurance;
		private Integer weightCapacity;
		private Integer batteryPower;
		private String otherFeatures;
		private final int ID;
		private final int pack_id;

		public UAVBuilder(int ID, int pack_id) {
            // required fields
            this.ID = ID;
            this.pack_id = pack_id;
		}

		public UAVBuilder setWingType(String wingType) {
			this.wingType = wingType;
            return this;
		}

		public UAVBuilder setFlightEndurance(String flightEndurance) {
			this.flightEndurance = flightEndurance;
            return this;
		}

		public UAVBuilder setWeightCapacity(int weightCapacity) {
            this.weightCapacity = weightCapacity;
			return this;
		}

		public UAVBuilder setBatteryPower(int batteryPower) {
            this.batteryPower = batteryPower;
			return this;
		}

		public UAVBuilder setOtherFeatures(String otherFeatures) {
            this.otherFeatures = otherFeatures;
			return this;
		}

		public UAVBuilder setSize(String size) {
            this.size = size;
			return this;
		}

		public UAV build() {
			return new UAV(this);
		}
	}
}
