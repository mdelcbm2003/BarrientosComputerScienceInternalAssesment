package sample;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class User {

    private String name;
    private String lastName;
    private String mail;
    private LocalDate yearOfGraduation;

    private HashMap<ibCourses,Integer> marks;
    private HashMap<ibCourses,Boolean> levels;


    public User () {
        Gson gson = new Gson ();
        User data = null;
        try {
            data = gson.fromJson(new FileReader("src/user.json"), User.class);
            this.name = data.name;
            this.lastName = data.lastName;
            this.mail = data.mail;
            this.yearOfGraduation = data.yearOfGraduation;
            this.marks = data.marks;
            this.levels = data.levels;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



       this.marks= new HashMap<>();
       this.levels= new HashMap<>();
    }


    public User(String name, String lastName, String mail, LocalDate yearOfGraduation){ //}, ibCourses[] courses, Boolean[] levels, Integer[] marks) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.yearOfGraduation = yearOfGraduation;
        this.marks= new HashMap<>();
        this.levels= new HashMap<>();
        //for (int i = 0; i <courses.length; i++) {
        //    this.marks.put(courses [i],marks[i]);
       //     this.levels.put(courses [i],levels[i]);
       // }
    }

    public void saveUser (String name, String lastName, String mail, LocalDate yearOfGraduation){
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.yearOfGraduation = yearOfGraduation;
        //for (int i = 0; i <courses.length; i++) {
        //    this.marks.put(courses [i],marks[i]);
        //    this.levels.put(courses [i],levels[i]);
        //}
        //save user to json file
    }

    //get
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    public LocalDate getYearOfGraduation() {
        return yearOfGraduation;
    }

    //set
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setYearOfGraduation(LocalDate yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
}
