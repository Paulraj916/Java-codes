public class javacopyobjects {

    public static void main(String[] args) {
        Car7 car1 = new Car7("Chevrolet","Camaro",2021);
		//Car7 car2 = new Car7("Ford","Mustang",2022);
		//car2.copy(car1);
		Car7 car2 = new Car7(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
    }
}