package school;

public class SortStudentByTall implements SortStudent {
    private CompareType compareType = new CompareByTall();

    @Override
    public void sortStudent(StudentRepository studentRepository) {
        compareType.compare(studentRepository.getStudentsMan());
        compareType.compare(studentRepository.getStudentsWoman());
        compareType.compare(studentRepository.getStudents());
    }
}
