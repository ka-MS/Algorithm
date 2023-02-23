package school;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryImplTest {

    @Test
    @DisplayName("add 메소드 성공")
    void addStudent() {
        // given 레포지토리 객체를 생성
        StudentRepository studentRepository = new StudentRepositoryImpl();

        // when 정상적인 데이터 주입
        int result = studentRepository.addStudent(new Student(20230001, "민석",170,Gender.Man));
        
        // then

        assertThat(result).isEqualTo(1);

    }

    @Test
    @DisplayName("add 메소드 키 실패")
    void addStudentTallErr() {
        // given 레포지토리 객체를 생성
        StudentRepository studentRepository = new StudentRepositoryImpl();

        // when 비정상적인 키 데이터 주입
        int result = studentRepository.addStudent(new Student(20230001, "민석",-1 ,Gender.Man));

        // then

        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("add 메소드 이름 실패")
    void addStudentNameErr() {
        // given 레포지토리 객체를 생성
        StudentRepository studentRepository = new StudentRepositoryImpl();

        // when 비정상적인 이름 데이터 주입
        int result = studentRepository.addStudent(new Student(20230001, "",100 ,Gender.Man));
        int result2 = studentRepository.addStudent(new Student(20230002, null,100 ,Gender.Man));

        // then

        assertThat(result).isEqualTo(0);
        assertThat(result2).isEqualTo(0);
    }

    @Test
    @DisplayName("add 메소드 Id 실패")
    void addStudentIdErr() {
        // given 레포지토리 객체를 생성
        StudentRepository studentRepository = new StudentRepositoryImpl();

        // when 중복 아이디 주입
        int result = studentRepository.addStudent(new Student(20230001, "민석",100 ,Gender.Man));
        int result2 = studentRepository.addStudent(new Student(20230001, "민석2",100 ,Gender.Man));

        // then

        assertThat(result2).isEqualTo(0);
    }
}