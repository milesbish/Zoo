public class Zookeeper {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zookeeper(String name){
        this.name = name;
    }
    public void feedAnimals(Animal animals[], String food){
        System.out.println(name + " is feeding " + food + " to " + animals.length + " animals.");
        for(int i = 0; i < animals.length; i++){
            animals[i].eat(food);
        }
    }
}
