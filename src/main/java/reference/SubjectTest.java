package reference;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setKoreaSubject("국어",100);
        studentLee.setMathSubject("수학",95);

        Student studentKim = new Student(101,"kim");
        studentKim.setKoreaSubject("국어",60);
        studentKim.setMathSubject("국어",70);

        studentLee.showStudentScore();
        studentKim.showStudentScore();
    }
}
