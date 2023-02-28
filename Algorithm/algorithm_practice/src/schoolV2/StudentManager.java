package schoolV2;

import java.util.*;

public class StudentManager{
    public static void main(String[] args) {
        List<Student> sm = new ArrayList<Student>();
        sm.add(new Student(20230001, "민석",170, Gender.Man));
        sm.add(new Student(20230002, "민철",190, Gender.Man));
        sm.add(new Student(20230003, "민지",150, Gender.Woman));
        sm.add(new Student(20230004, "민영",190, Gender.Woman));
        sm.add(new Student(20230005, "민수",160, Gender.Man));
        sm.add(new Student(20230006, "민구",180, Gender.Man));
        sm.add(new Student(20230007, "민희",140, Gender.Woman));
        sm.add(new Student(20230008, "민정",165, Gender.Woman));

//        print(sm);
        Collections.sort(sm);

        print(sm);

    }

    static void print(List<Student> students){
        for(Student s : students){
            System.out.println(s);
        }
    }


}
