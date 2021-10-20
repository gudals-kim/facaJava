package classpart;

import java.sql.SQLOutput;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentname = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentkim = new Student();
        studentkim.studentname = "김유신";
        studentkim.address = "경주";

        studentkim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentkim);
    }
}
