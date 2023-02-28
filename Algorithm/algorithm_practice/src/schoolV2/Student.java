package schoolV2;

public class Student implements Comparable<Student> {
    private int studentId;
    private String name;
    private double tall;
    private Gender gender;

    public Student(int studentId, String name, double tall, Gender gender) {
        this.studentId = studentId;
        this.name = name;
        this.tall = tall;
        this.gender = gender;
    }
    // compareTo 메소드의 리턴값은 우선순위를 의미
    // 나 (this) 와 상대(매개변수) 를 비교하여 양수면 나의 우선순위가 크로 음수면 상대의 우선순위가 크다.
    // 우선순위 오름차순으로 정렬하게됨
    @Override
    public int compareTo(Student o) {
        if(this.gender != o.gender){
//            System.out.println(o.getName()+  " : " + this.gender.compareTo(o.gender));
            return this.gender.compareTo(o.gender); //비교해서 크면(남자면) 양수 작으면 음수 리턴
        }else{
            if(this.gender == Gender.Man){
                return Double.compare(this.tall, o.tall);
            }else{
                return Double.compare(this.studentId ,o.studentId);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "학번=" + studentId +
                ", 이름='" + name + '\'' +
                ", 키=" + tall +
                ", 성별='" + gender + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        if (tall < 0) {
            throw new IllegalArgumentException("Tall cannot be negative");
        }
        this.tall = tall;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
