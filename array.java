class array{
    public static void main(String[] args) {
        /*String[] cars ={"bmw","tesla","benz","ferrari"};
        cars[0]="mustang";
        System.out.println(cars[0]);
        */
        String[] cars =new String[3];
        cars[0] = "tesla";
        cars[1] ="bmw";
        cars[2] ="benz";
        int a=cars.length;
        System.out.println(a);

        //System.out.println(cars[1]);
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
        
    }
}