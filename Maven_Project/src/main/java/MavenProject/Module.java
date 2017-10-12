package MavenProject;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String moduleID;
    private ArrayList<Student> students;

    public Module(String name, String id, ArrayList<Student> students) {
        this.moduleName = name;
        this.moduleID = id;
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
        student.addModule(this);
    }

    public void removeStudent(Student student) {
        int index = this.students.indexOf(student);
        this.students.remove(index);
    }

    public String getName() {
        return moduleName;
    }

    public void setName(String name) {
        this.moduleName = name;
    }

    public String getId() {
        return moduleID;
    }

    public void setId(String id) {
        this.moduleID = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}