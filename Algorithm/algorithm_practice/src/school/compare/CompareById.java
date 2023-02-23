package school.compare;

import school.Student;

import java.util.Comparator;
import java.util.List;

public class CompareById implements CompareType {
    @Override
    public void compare(List<Student> students) {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getStudentId(),o2.getStudentId());
            }
        });
    }
}
