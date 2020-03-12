public class Giraffe extends Animal{
    public Giraffe(String name) {
        super(name, "leaves");
    }
    public void eat(String food) {
        if (food != favoriteFood) {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
        if (food == favoriteFood) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
            System.out.println(name + " sleeps for 8 hours");
        }
    }
}
