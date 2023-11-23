public class Main {
    public static void main(String[] args) {
        Box<Orange> boxOfOranges = new Box<>(new Orange(), 2);
        Box<Orange> boxOfOranges2 = new Box<>();
        Box<Apple> boxOfApples = new Box<>();
        Apple apple = new Apple();
        boxOfApples.addFruit(apple, 3);
        //сравниваем коробку апельсинов и яблок
        System.out.println(boxOfOranges.compare(boxOfApples));
        //сравниваем 2 коробки апелсинов
        System.out.println(boxOfOranges2.compare(boxOfOranges));
        //пересыпаем апельсины
        boxOfOranges.pourInto(boxOfOranges2);
        System.out.println(boxOfOranges2.getWeight());
    }
}
