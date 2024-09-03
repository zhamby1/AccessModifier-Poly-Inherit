public class Person {



    private String name;
    private int age;
    private double checking_balance;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", checking_balance=" + checking_balance +
                '}';
    }
    public Person() {
    }
    public Person(String name, int age, double checking_balance) {
        this.name = name;
        this.age = age;
        this.checking_balance = checking_balance;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getChecking_balance() {
        return checking_balance;
    }

    public void setChecking_balance(double checking_balance) {
        this.checking_balance = checking_balance;
    }




    //getters - retrieve data from private variables/properties these are methods
    public String getName(){
        return name;
    }

    //setter - change or modify data
    public void setName(String name){
        this.name = name; //whatever you put in the parenthesis in this method it changes its name to it.
    }




}
