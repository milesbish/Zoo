public class Unicorn extends Animal {
    public Unicorn(String name) {
        super(name, "marshmallows");
    }
    public void sleep(String name) {
        System.out.println(name + " sleeps in a cloud");
    }
    public void eat(String food) {
        if(food == favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }
}
