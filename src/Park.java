import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractions;

    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String time, double cost) {
        attractions.add(new Attraction(name, time, cost));
    }

    public void showInfo() {
        System.out.println("Название парка:" + parkName +
                "\nАттракционы:");

        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    private class Attraction {
        private String nameAttraction;
        private String time;
        private double cost;

        public Attraction(String nameAttraction, String time, double cost) {
            this.nameAttraction = nameAttraction;
            this.time = time;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return
                    "Название:" + nameAttraction +
                    "\nВремя:" + time +
                    "\nЦена:" + cost+"\n" ;
        }
    }
}
