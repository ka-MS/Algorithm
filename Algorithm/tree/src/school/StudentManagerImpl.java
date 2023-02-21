package school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentManagerImpl implements StudentManager {

    private List<Student> studentsMan = new ArrayList<>();
    private List<Student> studentsWoman = new ArrayList<>();
    private List<Student> students;
    int i = 0;

    public StudentManagerImpl() {
        this.studentsMan = studentsMan;
        this.studentsWoman = studentsWoman;
    }

    @Override
    public void addStudent(String name, double tall, String sex) {
        if(name == null || tall == 0 || sex == null) {
            System.err.println("값을 넣어주세요");
            return;
        }else if (tall < 0) {
            System.err.println("키가 음수일수는 없어요");
            return;
        }
        if(sex.equals("man")) {
            studentsMan.add(new Student(++i ,name, tall, sex));
        }else if(sex.equals("woman")) {
            studentsWoman.add(new Student(++i ,name, tall, sex));
        }else{
            System.err.println("Invalid sex");
        }
    }

    @Override
    public void sortStudent() {
        studentsMan.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getTall(),o2.getTall());
            }
        });
        studentsWoman.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getStudentId(),o2.getStudentId());
            }
        });
    }

    @Override
    public void getStudentId(int StudentId) {
        System.out.println();
    }

    @Override
    public void showAllStudents() {
        students = new ArrayList<>();
        students.addAll(studentsMan);
        students.addAll(studentsWoman);
        for(Student student : students) {
            System.out.println(student);
        }
    }
}
