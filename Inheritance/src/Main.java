//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student newstudent = new Student("Zach",25,"A");
        Teacher newteacher = new Teacher("Bob", 45, "Biology 101");

        System.out.println(newstudent);
        System.out.println(newteacher);

    }
}