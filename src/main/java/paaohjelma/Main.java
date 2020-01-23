package paaohjelma;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ErrorList el = new ErrorList();
        Error testi = new Error(1, "StartDate is in the future");
        el.addErrorToList(testi);
        el.sortList();
        el.putErrorToFile("loki.txt");


    }
}
