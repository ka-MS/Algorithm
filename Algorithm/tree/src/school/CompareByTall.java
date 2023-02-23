package school;

import java.util.Comparator;
import java.util.List;

public class CompareByTall implements CompareType {

    @Override
    public void compare(List<Student> students) {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getTall(),o2.getTall());
            }
        });
    }
}
