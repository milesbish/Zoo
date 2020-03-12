public class Bee extends Animal {
    public Bee(String name) {
        super(name, "pollen");
    }
    public void eat(String food) {
        if(food == favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more pollen");
            System.out.println(this.name + " never sleeps");
        }
        if(food != favoriteFood){
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }
}