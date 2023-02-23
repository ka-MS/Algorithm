package school.sortstudent;

import school.compare.CompareById;
import school.compare.CompareByTall;
import school.compare.CompareType;
import school.studentrepo.StudentRepository;

public class SortStudentByGender implements SortStudent {
    private CompareType compareTall = new CompareByTall();
    private CompareType compareId = new CompareById();

    @Override
    public void sortStudent(StudentRepository studentRepository) {
        compareTall.compare(studentRepository.getStudentsMan());
        compareId.compare(studentRepository.getStudentsWoman());
        studentRepository.getStudents().clear();
        studentRepository.getStudents().addAll(studentRepository.getStudentsMan());
        studentRepository.getStudents().addAll(studentRepository.getStudentsWoman());

    }
}
