package school;

public class AppConfig {

    private StudentRepository studentRepository = new StudentRepositoryImpl();

    public StudentManager studentManager() {
        return new StudentManagerImpl(studentRepository, sortStudent());
    }

    private SortStudent sortStudent() {
        return new SortStudentByGender();
    }


}
