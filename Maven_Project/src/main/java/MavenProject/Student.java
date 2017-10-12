package MavenProject;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.ArrayList;

public class Student {

    private String FName;
    private String LName;
    private String userName;
    private int age;
    private String id;
    private LocalDate dob;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private Course course;


    public Student(String firstName,String surname, String id, LocalDate dob) {
        this.FName = firstName;
        this.LName = surname;
        this.id = id;
        this.dob = dob;
    }

    public String getFirstName() {
        return FName;
    }

    public void setFirstName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setSurname(String LName) {
        this.LName = LName;
    }

    public String getUsername() {
        String userName = this.FName + this.getAge();
        return userName.toLowerCase();
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        Years age = Years.yearsBetween(this.dob, new LocalDate());
        return age.getYears();
    }

    public String getId() {
        return id;
    }
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void addModule(Module module) {
        this.modules.add(0, module);
    }
}