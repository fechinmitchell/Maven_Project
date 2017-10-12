package MavenProject_Test;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.junit.Test;

import MavenProject.Module;
import MavenProject.Student;

public class ModuleTest {
    @Test
    public void addStudent() throws Exception {
        Student student = new Student("Fechin", "Mitchell", "1441182", new LocalDate(1996, 5, 17));
        Module module = new Module("Programming", "CT300", new ArrayList<Student>());

        module.addStudent(student);
    }

}