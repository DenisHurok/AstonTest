package Animals;

public class Plate {
    private Integer amountOfFood;

    public Plate(Integer amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public void addFood(int amount) {
        amountOfFood = amountOfFood + amount;
    }

    public Integer getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(Integer amountOfFood) {
        this.amountOfFood = amountOfFood;
    }
}
