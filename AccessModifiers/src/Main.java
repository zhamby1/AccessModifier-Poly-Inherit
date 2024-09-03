//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person myperson = new Person("Zach",10,100.00);
        System.out.println(myperson.getName());
        myperson.setName("Tim");
        System.out.println(myperson.getName());
        myperson.setAge(20);
        System.out.println(myperson.getAge());

        System.out.println(myperson);
        Person myperson2 = new Person();
        myperson2.setName("Bob");
        myperson2.setAge(20);
        myperson2.setChecking_balance(100.00);
        System.out.println(myperson2.getName());
        System.out.println(myperson2.getAge());



    }
}