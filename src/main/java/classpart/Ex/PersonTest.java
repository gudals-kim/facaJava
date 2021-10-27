package classpart.Ex;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 44;
        person.name = "김형민";
        person.marry = true;
        person.jasic = 3;

        System.out.println("이름 :"+person.name);
        System.out.println("나이 :"+person.age);
        System.out.println("결혼여부 :"+person.marry);
        System.out.println("자식수 :"+person.jasic);
    }
}
