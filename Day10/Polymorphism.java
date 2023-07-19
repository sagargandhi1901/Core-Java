package Day10;

class Plane {
	
	public void fly() {
		System.out.println("Plane is flying...");
	}
	
	public void takeOff() {
		System.out.println("Plane is taking off...");
	}
}

class CargoPlane extends Plane {
	
	@Override
	public void fly() {
		System.out.println("Cargo plane is flying at lower height.");
	}
	
	@Override
	public void takeOff() {
		System.out.println("Cargo plane requires longer runway for takeoff");
	}
}

class FighterPlane extends Plane {
	
	@Override
	public void fly() {
		System.out.println("Fighter plane is flying at higher height.");
	}
	
	@Override
	public void takeOff() {
		System.out.println("Fighter plane requires shorter runway for takeoff");
	}
}

class PassangerPlane extends Plane {
	
	@Override
	public void fly() {
		System.out.println("Passanger plane is flying at lower height.");
	}
	
	@Override
	public void takeOff() {
		System.out.println("Passanger plane requires medium size runway for takeoff");
	}
}

class Airport {
	public void permit(Plane plane) {
		plane.takeOff();					// same code will give different outputs as it will decide on runtime which method to be executed
		plane.fly();
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		PassangerPlane pp = new PassangerPlane();
		
//		cp.takeOff();
//		cp.fly();
//		
//		fp.takeOff();
//		fp.fly();
		
//		Plane plane;
//		
//		plane = cp;
//		plane.takeOff();
//		plane.fly();
//		
//		plane = fp;
//		plane.takeOff();
//		plane.fly();
//		
//		plane = pp;
//		plane.takeOff();
//		plane.fly();
		
		Airport airport = new Airport();
		airport.permit(cp);
		airport.permit(fp);
		airport.permit(pp);
	}
}
