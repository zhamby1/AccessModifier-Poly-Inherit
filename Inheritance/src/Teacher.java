public class Teacher extends Person {
    public String course_name;

    @Override
    public String toString() {
        return name + " " + age + " " + course_name + " " + school_name;
    }

    public Teacher(String name, int age, String course_name) {
        super(name, age);
        this.course_name = course_name;
    }

}
