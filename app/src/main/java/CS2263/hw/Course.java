package CS2263.hw;

public class Course {
    //instance variables
    String dept;
    String code;
    String courseNumb;
    String name;
    String credits;

    //constructor
    Course(String dept, String courseNumb, String name, String credits){
        this.dept=dept;
        this.courseNumb=courseNumb;
        this.name=name;
        this.credits = credits;
        switch (dept) {
            case "Computer Science":
                code = "CS";
                break;
            case "Chemistry":
                code = "CHEM";
                break;
            case "Physics":
                code = "PHYS";
                break;
            case "Mathematics":
                code = "MATH";
                break;
            case "Botany":
                code = "BTNY";
                break;
            default:
                code = "ZOO";
                break;
        }
    }
    //methods
    public String getCourseNumb(){return courseNumb;}
    public String getCredits(){return credits;}
    public String getDept(){return dept;}
    public String getCode(){return code;}
    public String getName(){return name;}
}
