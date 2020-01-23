package paaohjelma;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorList {
    private List<Error> errors;
    public ErrorList(){
        this.errors = new ArrayList<>();
    }
    public void addErrorToList(Error error){
        this.errors.add(error);
    }
    public void sortList(){
        Collections.sort(this.errors);
    }

    public void putErrorToFile(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);

        for (Error error: this.errors) {
            String line = error.toString();
            pw.println(line);
        }
        pw.close();
        fw.close();
    }
}
