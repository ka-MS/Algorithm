package school.studentrepo;

import school.Student;

import java.util.List;

public interface StudentRepository {
    int addStudent(Student student);
    List<Student> getStudentsMan() ;
    List<Student> getStudentsWoman() ;
    List<Student> getStudents();
}
