package Animals;

public abstract class Animal {
    private String animalName;
    private Integer swimLimit;
    private Integer runLimit;
    private static int animalCount;

    public Animal(String animalName, Integer swimLimit, Integer runLimit) {
        this.animalName = animalName;
        this.swimLimit = swimLimit;
        this.runLimit = runLimit;
        animalCount++;
    }

    public String run(int runDistance) {
        if (runDistance <= runLimit) {
            return getAnimalName() + " пробежал " + runDistance + " м";
        } else {
            return getAnimalName() + " не добежал до конца";
        }
    }

    public String swim(int swimDistance) {
        if (swimDistance <= swimLimit) {
            return getAnimalName() + " проплыл " + swimDistance + " м";
        } else {
            return getAnimalName() + " не доплыл до конца";
        }
    }

    public String getAnimalName() {
        return animalName;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
