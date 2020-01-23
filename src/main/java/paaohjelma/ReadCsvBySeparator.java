package paaohjelma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.format.DateTimeFormatter;

public class ReadCsvBySeparator {
    public ReadCsvBySeparator() {
    }

    public void readFileBySeparator() {
        try {
            String csvFile = "CourseData_20180901_210145.csv";
            String line = "";
            String cvsSplitBy = ";";

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

                while ((line = br.readLine()) != null) {

                    String[] dataline = line.split(cvsSplitBy);

                    int i = 0;
                    while(i < dataline.length) {
                        System.out.println(dataline[i]);
                        i++;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("virhe" + e);
        }

    }

}
