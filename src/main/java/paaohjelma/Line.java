package paaohjelma;

import java.time.LocalDate;

public class Line {
    private int coursecode;
    private String name;
    private LocalDate startdate;
    private LocalDate enddate;
    private String location;
    private String materialtype;
    private String description;
    private String materialcode;
    private String maincategory;
    private String subcat1;
    private String subcat2;

    public Line(int coursecode, String name, LocalDate startdate, LocalDate enddate,
                String location, String materialtype, String description, String materialcode,
                String maincategory, String subcat1, String subcat2){
        this.coursecode = coursecode;
        this.name = name;
        this.startdate = startdate;
        this.enddate = enddate;
        this.location = location;
        this.materialtype = materialtype;
        this.description = description;
        this.materialcode = materialcode;
        this.maincategory = maincategory;
        this.subcat1 = subcat1;
        this.subcat2 = subcat2;
    }

    public int getCoursecode() {
        return coursecode;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public String getLocation() {
        return location;
    }

    public String getMaterialtype() {
        return materialtype;
    }

    public String getDescription() {
        return description;
    }

    public String getMaterialcode() {
        return materialcode;
    }

    public String getMaincategory() {
        return maincategory;
    }

    public String getSubcat1() {
        return subcat1;
    }

    public String getSubcat2() {
        return subcat2;
    }
}
