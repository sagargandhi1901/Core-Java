package Day9;

class Plane {
	
	public void takeOff() {
		System.out.println("Plane is taking off...");
	}
	
	public void fly() {
		System.out.println("Plane is flying...");
	}
}

class CargoPlane extends Plane {
	
	@Override
	public void fly() {
		System.out.println("Cargo plane is flying at lower height.");
	}
	
	public void carryGoods() {
		System.out.println("Cargo plane carry goods...");
	}
}

class PassangerPlane extends Plane {
	
	@Override
	public void fly() {
		System.out.println("Passanger plane is flying at medium height.");
	}
	
	public void carryPassangers() {
		System.out.println("Passanger plane carry passangers...");
	}
}

public class UmlPractice {
	public static void main(String[] args) {
		CargoPlane plane = new CargoPlane();
		plane.fly();
		plane.takeOff();
		plane.carryGoods();
		
		Plane cPlane = new CargoPlane();
		cPlane.fly();						// child class method will be executed as the object created is of child class
		cPlane.takeOff();
		((CargoPlane)cPlane).carryGoods();
		
		PassangerPlane plane2 = new PassangerPlane();
		plane2.fly();
		plane2.takeOff();
	}
}
