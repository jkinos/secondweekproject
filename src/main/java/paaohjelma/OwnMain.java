package paaohjelma;

import java.io.IOException;

public class OwnMain {
    public static void main(String[] args) throws IOException {

        LinesList hugelist = new LinesList();

        Line something1 = new Line(1,566962, "Sovelto Hybrid: MCSA Machine Learning","5.11.2018", "4.2.2019", "Pasila", "","Sertifioidu Azuren koneoppimessaMachine learning kuuluu tämän hetken kuumimpiin termeihin.", "True", "Technology", "Databases and Analytics", "Reporting and BI");
        hugelist.addToLinesList(something1);

        System.out.println(something1);

        hugelist.printListToFile("test.txt");

 /*       for(Line temp : hugelist) {
            System.out.println(temp);
        }*/

    }
}
