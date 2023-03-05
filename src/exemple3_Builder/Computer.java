package exemple3_Builder;

public class Computer {

	// required parameters
	protected String HDD;
	protected String RAM;
	// optional parameters
	protected boolean isGraphicsCardEnabled;
	protected boolean isBluetoothEnabled;

	public Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public static class ComputerBuilder {

		// required parameters
		protected String HDD;
		protected String RAM;

		// optional parameters
		protected boolean isGraphicsCardEnabled;
		protected boolean isBluetoothEnabled;

		// Constructor with required parameters
		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
		}

		// Setter methods for optional parameters
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		// Build method to create Computer object
		public Computer build() {
			return new Computer(this);
		}

	}

}
