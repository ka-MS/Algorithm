package school.studentrepo;

import school.Gender;
import school.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentRepositoryImpl implements StudentRepository {
    private final List<Student> studentsMan ;
    private final List<Student> studentsWoman ;
    private final List<Student> students;
    private final Set<Integer> studentIds;

    public StudentRepositoryImpl() {
        this.studentsMan = new ArrayList<>();
        this.studentsWoman = new ArrayList<>();
        this.students = new ArrayList<>();
        this.studentIds = new HashSet<>();
    }

    @Override
    public int addStudent(Student student) {
        if(student.getName() == null || student.getName().isEmpty()) {
            System.err.println("Invalid Name");
            return 0;
        }
        if (student.getTall() < 0){
            System.err.println("Invalid Tall");
            return 0;
        }
        if(studentIds.contains(student.getStudentId())){
            System.err.println("No duplication Id");
            return 0;
        }
        if(student.getGender() == Gender.Man) {
            studentIds.add(student.getStudentId());
            studentsMan.add(student);
            students.add(student);
            return 1;
        }else if(student.getGender() == Gender.Woman) {
            studentIds.add(student.getStudentId());
            studentsWoman.add(student);
            students.add(student);
            return 1;
        }else{
            System.err.println("Invalid Gender");
            return 0;
        }
    }

    @Override
    public List<Student> getStudentsMan() {
        return studentsMan;
    }

    @Override
    public List<Student> getStudentsWoman() {
        return studentsWoman;
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }
}
