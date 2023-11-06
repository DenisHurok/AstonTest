package Animals;

public class Dog extends Animal {
    public static final Integer DOGRUNLIMIT = 500;
    public static final Integer DOGSWIMLIMIT = 10;
    private static int dogCount;


    public Dog(String animalName) {
        super(animalName, DOGSWIMLIMIT, DOGRUNLIMIT);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
