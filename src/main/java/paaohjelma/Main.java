package paaohjelma;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadCsvByLine rcbl = new ReadCsvByLine();
        List<String> lines = rcbl.readFileByLine("CourseData_20180901_210145.csv");
        Datafilters df = new Datafilters();
        String lokiFile = "loki.txt";
        String goodDataFile = "lines.txt";

        ErrorList missingFields = df.filterMissingFieldError(lines);
        missingFields.sortList();
        missingFields.putErrorToFile(lokiFile);

        LinesList lineObjects = df.filterRightAmountOfLines(lines);
        lineObjects.printListToFile("lines.txt");

        ErrorList startDayInFuture = df.filterStartDayIsInFutureError(lineObjects);
        startDayInFuture.sortList();
        startDayInFuture.putErrorToFile(lokiFile);

        ErrorList tooLongCourseDescription = df.filterCourseDescriptionIsTooLongError(lineObjects);
        tooLongCourseDescription.sortList();
        tooLongCourseDescription.putErrorToFile(lokiFile);




    }
}
