package paaohjelma;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Line {
    private int lineNumber;
    private int coursecode;
    private String name;
    private LocalDate start;
    private LocalDate end;
/*    private String startdate;
    private String enddate;*/
    private String location;
    private String materialtype;
    private String description;
    private String materialcode;
    private String maincategory;
    private String subcat1;
    private String subcat2;

    public Line(int lineNumber, int coursecode,
                String name,
/*                LocalDate startdate,
                LocalDate enddate,*/
                String startdate,
                String enddate,
                String location,
                String materialtype,
                String description,
                String materialcode,
                String maincategory,
                String subcat1,
                String subcat2) {
        this.lineNumber = lineNumber;
        this.coursecode = coursecode;
        this.name = name;
        this.start = convertStringToLocalDate(startdate);
        this.end = convertStringToLocalDate(enddate);

        this.location = location;
        this.materialtype = materialtype;
        this.description = description;
        this.materialcode = materialcode;
        this.maincategory = maincategory;
        this.subcat1 = subcat1;
        this.subcat2 = subcat2;
    }

    private LocalDate convertStringToLocalDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        return LocalDate.parse(date, formatter);
    }


    public int getLineNumber() {
        return this.lineNumber;
    }

    public int getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(int coursecode) {
        this.coursecode = coursecode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getStart() {
        return this.start;
    }

    public void setStart(LocalDate date) {
        this.start = date;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate date) {
        this.end = date;
 
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMaterialtype() {
        return materialtype;
    }

    public void setMaterialtype(String materialtype) {
        this.materialtype = materialtype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterialcode() {
        return materialcode;
    }

    public void setMaterialcode(String materialcode) {
        this.materialcode = materialcode;
    }

    public String getMaincategory() {
        return maincategory;
    }


    public void setMaincategory(String maincategory) {
        this.maincategory = maincategory;
    }

    public String getSubcat1() {
        return subcat1;
    }


    public void setSubcat1(String subcat1) {
        this.subcat1 = subcat1;
    }

    public String getSubcat2() {
        return subcat2;
    }

    public void setSubcat2(String subcat2) {
        this.subcat2 = subcat2;
    }

//huom, prints dates as localdate -form not as original string form "dd.mm.yyy"
    @Override
    public String toString() {
        return lineNumber + ";" + coursecode + ";" + name + ";" + start + ";" + end + ";" + location + ";" + materialtype + ";"
                + description + ";" + materialcode + ";" + maincategory + ";" + subcat1 + ";" + subcat2;
    }

}
