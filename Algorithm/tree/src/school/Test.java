package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        StudentManager sm = new StudentManagerImpl();
        sm.addStudent("동석",180,"man");
        sm.addStudent("민주",160,"woman");
        sm.addStudent("민석",170,"man");
        sm.addStudent("민지",150,"woman");
        sm.addStudent("민정",160,"woman");
        sm.addStudent("주석",160,"man");
        sm.addStudent("민희",170,"woman");
        sm.addStudent("자석",190,"man");

        sm.sortStudent();
        sm.showAllStudents();


    }
}
