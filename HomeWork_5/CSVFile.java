package HomeWork_5;


import java.util.Arrays;

public class CSVFile {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("file.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("file_1.csv");
    }

}