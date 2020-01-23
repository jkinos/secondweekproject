package paaohjelma;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    public class ReadCsvByLine {
        List<String> rivit = new ArrayList<>();
        public List<String> readFileByLine(String fileName) {
            try {
                String csvFile = fileName;
                String line = "";
                String cvsSplitBy = ";";
                try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                    while ((line = br.readLine()) != null) {
                        String[] dataline = line.split("\n");
                        int i = 0;
                        while (i < dataline.length) {
                            rivit.add(dataline[i]);
                            //System.out.println(dataline[i]);
                            i++;
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("virhe" + e);
            }
            return rivit;
        }
    }

