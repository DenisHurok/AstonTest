import java.util.*;

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    Box(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            fruits.add(fruit);
        }
    }

    public Box() {
    }

    public void addFruit(T fruit, Integer amount) {
        for (int i = 0; i < amount; i++) {
            fruits.add(fruit);
        }
    }

    public float getWeight() {
        float total = 0.0f;
        for (T fruit : fruits) {
            total += fruit.getWeight();
        }
        return total;
    }

    public boolean compare(Box<?> another) {
        return Float.compare(this.getWeight(), another.getWeight()) == 0;
    }

    public void pourInto(Box<T> another) {
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}