package MavenProject;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import java.util.ArrayList;

public class Course {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Module> modules;

    public Course(String name, LocalDate startDate, LocalDate endDate, ArrayList<Module> modules) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = modules;
    }

    public void addModule(Module module) {
        this.modules.add(0, module);

        for(Student student: module.getStudents()) {
            student.setCourse(this);
        }
    }

    public void removeModule(Module module) {
        int index = this.modules.indexOf(module);
        this.modules.remove(index);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}