package Main.Java.homework.Java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppData {

    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void save(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(String.join(";", header));
            writer.newLine();

            for (int[] row : data) {
                String rowString = "";
                for (int i = 0; i < row.length; i++) {
                    rowString += row[i] + ";";
                }
                writer.write(rowString);
                writer.newLine();
            }
        }
    }
}