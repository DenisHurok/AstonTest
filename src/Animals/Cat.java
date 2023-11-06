package Animals;

public class Cat extends Animal {
    public static final Integer CATRUNLIMIT = 200;
    public static final Integer CATSWIMLIMIT = 0;
    private static int catCount;
    private boolean isHungry = false;

    public Cat(String animalName) {
        super(animalName, CATSWIMLIMIT, CATRUNLIMIT);
        catCount++;
    }

    @Override
    public String swim(int swimDistance) {
        return getAnimalName() + " не стал мочить лапки и не поплыл";
    }

    public void eat(int amount, Plate plate) {
        if (plate.getAmountOfFood() >= amount) {
            setHungry(true);
            plate.setAmountOfFood(plate.getAmountOfFood() - amount);

        }
    }

    public static int getCatCount() {
        return catCount;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isHungry() {
        return isHungry;
    }
}

