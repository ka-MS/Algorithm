package school.studentmanager;

import school.Student;

public interface StudentManager {

    int addStudent(Student student);
    void sortStudent();
    void showAllStudents();
    void showWomenStudents();
    void showMenStudents();

}
