package school;

import school.sortstudent.SortStudent;
import school.sortstudent.SortStudentByGender;
import school.studentmanager.StudentManager;
import school.studentmanager.StudentManagerImpl;
import school.studentrepo.StudentRepository;
import school.studentrepo.StudentRepositoryImpl;

public class AppConfig {

    private StudentRepository studentRepository = new StudentRepositoryImpl();

    public StudentManager studentManager() {
        return new StudentManagerImpl(studentRepository, sortStudent());
    }

    private SortStudent sortStudent() {
        return new SortStudentByGender();
    }


}
