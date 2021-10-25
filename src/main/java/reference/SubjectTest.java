package reference;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setSubject(100,"국어");
        studentLee.setSubject(90,"수학");

        Student studentKim = new Student(101,"kim");
        studentKim.setSubject(60,"수학");
        studentKim.setSubject(40,"국어");

        studentLee.showStudentScore();
        studentKim.showStudentScore();
    }
}
