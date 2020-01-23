package paaohjelma;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LinesList {

    private List<Line> listOfLines;

    public LinesList() {
        this.listOfLines = new ArrayList<>();
    }

    public List<Line> getListOfLines() {
        return listOfLines;
    }

    public void setListOfLines(List<Line> listOfLines) {
        this.listOfLines = listOfLines;
    }

    public void addToLinesList(Line object) {
        this.listOfLines.add(object);
    }

    public void printListToFile(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename, true);
        PrintWriter pw = new PrintWriter(fw);

/*        this.listOfLines.stream()
                .forEach(oneline -> pw.println(oneline));*/

        for(Line oneline : this.listOfLines) {
             pw.println(oneline);
        }
        pw.close();
        fw.close();

    }


    @Override
    public String toString() {
        return "LinesList{" +
                "listOfLines=" + listOfLines +
                '}';
    }
}
