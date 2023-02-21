package school;

public class Student {
    private int studentId;
    private String name;
    private double tall;
    private String sex;

    public Student(int studentId, String name, double tall, String sex) {
        this.studentId = studentId;
        this.name = name;
        this.tall = tall;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "학번=" + studentId +
                ", 이름='" + name + '\'' +
                ", 키=" + tall +
                ", 성별='" + sex + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
