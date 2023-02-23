package school;

public class StudentManagerImpl implements StudentManager {
    private StudentRepository studentRepository;
    private SortStudent sortStudent;

    public StudentManagerImpl(StudentRepository studentRepository, SortStudent sortStudent) {
        this.studentRepository = studentRepository;
        this.sortStudent = sortStudent;
    }

    public void setSortStudent(SortStudent sortStudent) {
        this.sortStudent = sortStudent;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public SortStudent getSortStudent() {
        return sortStudent;
    }

    @Override
    public int addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    @Override
    public void sortStudent() {
        sortStudent.sortStudent(studentRepository);
    }

    @Override
    public void showAllStudents() {
        for(Student student : studentRepository.getStudents()) {
            System.out.println(student);
        }
    }

    @Override
    public void showWomenStudents() {
        for(Student student : studentRepository.getStudentsWoman()) {
            System.out.println(student);
        }
    }

    @Override
    public void showMenStudents() {
        for(Student student : studentRepository.getStudentsMan()) {
            System.out.println(student);
        }
    }

}
