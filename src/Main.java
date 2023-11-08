import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String [] header = {"val1","val2"};
        int[][] data ={{134,221},{132,212},{332,221}};
        AppData appData = new AppData(header,data,"src/file.csv");
        appData.save();
        appData.load();
    }
}
