package paaohjelma;

public class Error implements Comparable<Error>{
    int lineNumber;
    String field;
    String explanation;

    public Error(int lineNumber, String field, String explanation){
        this.lineNumber = lineNumber;
        this.field = field;
        this.explanation = explanation;
    }

    public int getLine() {
        return lineNumber;
    }

    public String getField() {
        return field;
    }

    public String getExplanation() {
        return explanation;
    }

    @Override
    public String toString() {
        return this.lineNumber + ";" + this.field +";" + this.explanation;
    }

    @Override
    public int compareTo(Error error) {
        return this.lineNumber-error.getLine();
    }
}

