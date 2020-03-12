public class Animal {
    public String favoriteFood;
    public String name;
    static int population = 0;

    public Animal(String name, String favoriteFood){
        this.name = name;
        this.favoriteFood = favoriteFood;
    }
    public void sleep(String name) {
        System.out.println(this.name + " sleeps for 8 hours");
    }
    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food == favoriteFood){

            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }
}
