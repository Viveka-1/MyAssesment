package assignment3;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Car {
	
	
	public void driveCar() {
		System.out.println("driveCar method printed");
	}
	
	protected void applyBrake() {
		System.out.println("applyBrake method printed");
		
	}
	
	private void soundHour() {
		System.out.println("soundHour method printed");

	}
	
	void isPuncture() {
		System.out.println("ispuncture method printed");
	}

	public static void main(String[] args) {

		Car obj = new Car();
		
		obj.applyBrake();
		obj.driveCar();
		obj.isPuncture();
		obj.soundHour();
		
		
	

	}

}
