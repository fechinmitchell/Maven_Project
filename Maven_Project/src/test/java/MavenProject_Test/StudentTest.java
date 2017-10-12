package MavenProject_Test;

import org.joda.time.LocalDate;
import org.junit.Test;

import MavenProject.Module;
import MavenProject.Student;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
	
	@Test
	public void addModule() throws Exception {
	    Student student = new Student("Fechin", "Mitchell", "14441182", new LocalDate(1996, 5, 17));
	    Module module = new Module("Programming", "CT123", new ArrayList<Student>());

	        student.addModule(module);
	    }

    @Test
    public void getAge() throws Exception {
        LocalDate testDob = new LocalDate(1996, 5, 17);
        Student studentTest = new Student("Fechin", "Mitchell", "14441182", testDob);
        int genAge = studentTest.getAge();
        int expAge = 21;

        assertEquals(expAge, genAge);
    }

    @org.junit.Test
    public void getUsername() throws Exception {
    	LocalDate testDob = new LocalDate(1996, 5, 17);
        Student studentTest = new Student("Fechin", "Mitchell", "14441182", testDob);
        String genUsername = studentTest.getUsername();
        String expUsername = "fechin21";

        assertEquals(expUsername, genUsername);
    }


}