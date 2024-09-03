import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //make a new array list say Arraylist<datatype> =  new ArrayList<>()
        ArrayList<Person> mypeople = new ArrayList<>();
        String cust_name;
        int cust_age;
        double cust_balance;
        String quit = "n";

        do {
            System.out.println("Enter your customer name: ");
            cust_name = input.next();
            System.out.println("Enter your customer age: ");
            cust_age = input.nextInt();
            System.out.println("Enter your customer balance: ");
            cust_balance = input.nextDouble();
            Person person = new Person(cust_name, cust_age, cust_balance);
            mypeople.add(person);
            System.out.println("Do you wish to quit? (y/n)");
            quit = input.next();
        }
        while (quit.equals("n"));

        for (Person person : mypeople) {
            System.out.println(person);
        }


    }
}