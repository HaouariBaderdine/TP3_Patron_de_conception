package exemple3_Builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer computer = new Computer.ComputerBuilder("1TB", "8GB").setGraphicsCardEnabled(true)
				.setBluetoothEnabled(true).build();

		System.out.println("HDD: " + computer.getHDD());
		System.out.println("RAM: " + computer.getRAM());
		System.out.println("Graphics Card Enabled: " + computer.isGraphicsCardEnabled());
		System.out.println("Bluetooth Enabled: " + computer.isBluetoothEnabled());
	}

}
