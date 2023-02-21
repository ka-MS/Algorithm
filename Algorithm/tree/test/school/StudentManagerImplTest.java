package school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class StudentManagerImplTest {

    @Test
    void addStudent() {
        // given 주어진 값
        StudentManager sm = new StudentManagerImpl();

        // when 언제
        sm.addStudent("민석",170,"mans");

        // then 어떤결과 ????!?

    }

    @Test
    void sortStudent() {
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

    @Test
    void showAllStudents() {
    }
}