package Day6;

class Fan {
	String brand;
	int cost;
	
	// this toString() is required to print a java object in the way we want
	@Override
	public String toString() {
		return "brand=" + brand + ", cost=" + cost;
	}
}

public class ObjectArray {
	public static void main(String[] args) {
		
		// Creating an array of Fan type (non primitive)
		Fan[] fans = new Fan[2];
		fans[0] = new Fan();
		fans[1] = new Fan();
		
		fans[0].brand = "Bajaj";
		fans[0].cost = 123;
		
		fans[1].brand = "Heavells";
		fans[1].cost = 1234;
		
		// Printing the array
		for(Fan fan : fans) {
			System.out.println(fan);
		}
	}
}
