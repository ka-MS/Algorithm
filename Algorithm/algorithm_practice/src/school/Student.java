package school;

public class Student {
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

    @Override
    public String toString() {
        return "Student{" +
                "학번=" + studentId +
                ", 이름='" + name + '\'' +
                ", 키=" + tall +
                ", 성별='" + gender + '\'' +
                '}';
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }
}
