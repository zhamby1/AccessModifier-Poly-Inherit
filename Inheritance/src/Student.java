public class Student extends Person {

    public String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + grade;
    }


}
