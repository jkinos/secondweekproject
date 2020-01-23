package paaohjelma;

import java.util.List;

public class ListStreamers {

    public ErrorList filterMissingFieldError(List<String> lines){
        ErrorList missingFieldErrors = new ErrorList();
        lines.stream()
                .map(line -> line.split(";"))
                .filter(fields -> fields.length != 11)
                .map(line -> new Error (lines.indexOf(line),"Missing field/fields"))
                .forEach(error -> missingFieldErrors.addErrorToList(error));
        return missingFieldErrors;
    }
    public LineList filterRightAmountOfLines(List<String>lines){
        LineList rightAmountOfFields = new LineList();
        lines.stream()
                .map(line -> line.split(";"))
                .filter(fields -> fields.length == 11)
                .map(line -> new Line (lines.indexOf(line),Integer.valueOf(fields[0]),fields[1],fields[2],fields[3],fields, fields[4],fields[5],fields[5],
                        fields[6],fields[7],fields[8],fields[9],fields[10],fields[11]))
                .forEach(line -> rightAmountOfFields.addToLinesList(line));
        return rightAmountOfFields;
    }
}
