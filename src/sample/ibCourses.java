package sample;

public enum ibCourses  {
    ENGLISH ("English"),
    SPANISH ("Spanish"),
    MATHS ("Maths"),
    COMPUTER_SCIENCE ("Computer Science"),
    CHEMISTRY ("Chemistry"),
    PHYSICS ("Physics"),
    BIOLOGY ("Biology"),
    ENVIRONMENTAL_SYSTEMS_AND_SOCIETIES ("Environmental Systems and Societies"),
    THEATER_ARTS ("Theater Arts"),
    ART ("Art"),
    MUSIC ("Music"),
    PSYCHOLOGY ("Psychology"),
    ECONOMICS ("Economics");

    private String courseName;



    ibCourses (String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return courseName;

    }

    public String getCourseName() {
        return courseName;
    }
}
