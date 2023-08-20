public class polymorphism {

    public static void main(String[] args) {
		
		// polymorphism = 	greek word for poly-"many", morph-"form"
		//					The ability of an object to identify as more than one type
		
		Car8 car = new Car8();
		Bicycle1 bicycle = new Bicycle1();
		Boat boat = new Boat();
		
		Vehicle2[] racers = {car,bicycle,boat};
		
		for(Vehicle2 x : racers) {
			x.go();
		}
    }
}