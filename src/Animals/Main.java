package Animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Боби");
        Plate plate = new Plate(1);
        plate.addFood(10);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("КотСтарший");
        cats[1] = new Cat("КотСредний");
        cats[2] = new Cat("КотМладший");
        for (Cat cat : cats) {
            cat.eat(10, plate);
            System.out.println(cat.getAnimalName() + " " + cat.isHungry());
        }

        System.out.println(cats[0].run(20));
        System.out.println(cats[0].swim(50));


        System.out.println(Cat.getCatCount());

        System.out.println(dog.run(20));
        System.out.println(dog.swim(50));

        System.out.println(dog.getDogCount());
        System.out.println(Animal.getAnimalCount());

    }
}
