package sample;

import java.util.ArrayList;

// This would be the different data the universities information will have.

public class University {
    private final String NAME;
    private double tuition;
    private String location;
    private ArrayList<Course> Majors;
    private ArrayList<Course> Minors;

    public University (String name, double tuition, String location) {
        this.NAME = name;
        this.tuition = tuition;
        this.location = location;

    }
    //get
    public ArrayList<Course> getMajors() {
        return Majors;
    }

    public ArrayList<Course> getMinors() {
        return Minors;
    }

    public String getName() {
        return NAME;
    }

    public double getTuition() {
        return tuition;
    }

//set

    public void setLocation(String location) {
        this.location = location;
    }

    public void addMajor(Course course) {
        Majors.add(course);
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public void addMinors(Course course) {
        Minors.add(course);
    }
}
