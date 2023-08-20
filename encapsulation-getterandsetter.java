class encapsulation1{

    public static void main(String[] args) {
        Car6 car = new Car6("ford","icon",2021);
        car.setMake("audi");
        car.setModel("icon3");
        car.setyear(2023);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getyear());

    }
    
}