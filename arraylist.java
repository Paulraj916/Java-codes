import java.util.ArrayList;

class arraylist {
    public static void main(String[] args) {
        // ArrayList = 	a resizable array. 
		//				Elements can be added and removed after compilation phase
		//				store reference data types
        ArrayList<String> food = new ArrayList<String>();   
        food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi");
		//food.remove(2);
		//food.clear();
		int a= food.size();
        System.out.println(a);
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
     }
}
