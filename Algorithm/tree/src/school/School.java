package school;


public class School {

    public static void main(String[] args) {
        AppConfig ac = new AppConfig();
        StudentManagerImpl sm = (StudentManagerImpl)ac.studentManager();
        sm.addStudent(new Student(20230001, "민석",170,Gender.Man));
        sm.addStudent(new Student(20230002, "민철",190,Gender.Man));
        sm.addStudent(new Student(20230003, "민지",150,Gender.Woman));
        sm.addStudent(new Student(20230004, "민영",190,Gender.Woman));
        sm.addStudent(new Student(20230005, "민수",160,Gender.Man));
        sm.addStudent(new Student(20230006, "민구",180,Gender.Man));
        sm.addStudent(new Student(20230007, "민희",140,Gender.Woman));
        sm.addStudent(new Student(20230008, "민정",165,Gender.Woman));
        sm.sortStudent();
        sm.showAllStudents();
        sm.setSortStudent(new SortStudentByTall());
        sm.sortStudent();
        sm.showAllStudents();

    }
}
