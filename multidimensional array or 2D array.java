class multidimensional {
    public static void main(String[] args) {
        //2D array =an array of arrays
        /*String[][] cars = new String[3][3];
        cars[0][0]="panul";
        cars[0][1]="paul";
        cars[0][2]="paul";
        cars[1][0]="paul";
        cars[1][1]="paul";
        cars[1][2]="paul";
        cars[2][0]="paul";
        cars[2][1]="paul";
        cars[2][2]="paul";
        int a =cars[0].length;
        System.out.println(a);
        for(int i=0;i<cars.length;i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }
        }*/
        String[][] cars = {
                                {"paul","raj","danial"},
                                {"rithika","evanjaline","stella"},
                                {"bakiyaraj","antony","jose"}
                          };
        for(int i=0;i<cars.length;i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }
        }

    }
}
