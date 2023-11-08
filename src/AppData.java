import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;
    private String filename;

    public AppData(String[] header, int[][] data, String filename) {
        this.header = header;
        this.data = data;
        this.filename = filename;
    }
    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i < header.length; i++) {
                writer.write(header[i]);
                if (i < header.length - 1) {
                    writer.write(";");
                }
            }
            for (int i = 0; i < data.length; i++) {
                writer.newLine();
                for (int j = 0; j < data[i].length; j++) {

                    writer.write(String.valueOf(data[i][j]));
                    if (j < data[i].length - 1) {
                        writer.write(";");
                    }
                }
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void load() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
