package paaohjelma;

public class Error implements Comparable<Error>{
    int lineNumber;
    String explanation;

    public Error(int lineNumber, String explanation){
        this.lineNumber = lineNumber;
        this.explanation = explanation;
    }

    public int getLine() {
        return lineNumber;
    }

    public String getExplanation() {
        return explanation;
    }

    @Override
    public String toString() {
        return this.lineNumber + ";" + this.explanation;
    }

    @Override
    public int compareTo(Error error) {
        return this.lineNumber-error.getLine();
    }
}

