package paaohjelma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Datafilters {

    public ErrorList filterMissingFieldError(List<String> lines){
        ErrorList missingFieldErrors = new ErrorList();
        for(int i = 0; i < lines.size() ; i++){
            String[] fields = lines.get(i).split(";");
            if(fields.length != 11){
                Error missingField = new Error(i,"MISSING FIELD/FIELDS");
                missingFieldErrors.addErrorToList(missingField);
            }
        }
        return missingFieldErrors;
    }
    public LinesList filterRightAmountOfLines(List<String>lines){
        lines.remove(0);
        LinesList rightAmountOfFieldsList = new LinesList();
        for(int i = 0 ; i < lines.size() ; i++) {
            String[] fields = lines.get(i).split(";");
            if (fields.length == 11) {
                Line rightAmountOfFields = new Line(i, Integer.valueOf(fields[0]), fields[1], fields[2], fields[3], fields[4], fields[5],
                        fields[6], fields[7], fields[8], fields[9], fields[10]);
                rightAmountOfFieldsList.addToLinesList(rightAmountOfFields);
            }
        }
        return rightAmountOfFieldsList;
    }
    public ErrorList filterStartDayIsInFutureError(LinesList lines) {
        ErrorList startDayInFutureErrors = new ErrorList();
        for (Line line : lines.getListOfLines()) {
            Boolean b =(line.getStart().isAfter(line.getEnd()) || line.getStart().isAfter(LocalDate.now())) ;
            if (b) {
                Error startDayInFuture = new Error(line.getLineNumber(), "START DATE IN FUTURE");
                System.out.println(line);
                startDayInFutureErrors.addErrorToList(startDayInFuture);
            }
        }
        return startDayInFutureErrors;
    }
    public ErrorList filterCourseDescriptionIsTooLongError(LinesList lines){
        ErrorList tooLongCourseDescriptionErrors = new ErrorList();
        for (Line line : lines.getListOfLines()){
            if (line.getDescription().length()>500){
                Error tooLongCourseDescription = new Error (line.getLineNumber(),"SHORT COURSE DESCRIPTION IS OVER 500 CHARACTERS");
                System.out.println(line);
                tooLongCourseDescriptionErrors.addErrorToList(tooLongCourseDescription);
            }
        }
        return tooLongCourseDescriptionErrors;
    }
}
