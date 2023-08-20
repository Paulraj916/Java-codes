public class constructor {
    public static void main(String[] args) {
        Human human1 = new Human("stella",17,60);
        Human human2 = new Human("paul",17,60);
        System.out.println(human2.name);
        human1.eat();
        human2.playing();

    }
}