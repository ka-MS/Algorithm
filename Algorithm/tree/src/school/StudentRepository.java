package school;

import java.util.List;

public interface StudentRepository {
    int addStudent(Student student);
    List<Student> getStudentsMan() ;
    List<Student> getStudentsWoman() ;
    List<Student> getStudents();
}
