import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //we want to enter data to be put in an array to store people records like a bank system

        int customer_age;
        String customer_name;
        double customer_balance;
        int quit = 0;
        int counter = 0;

        //create an array to hold a bunch of people
        //remember when making a class you can use a class name as a "type"
        Person[] personArray = new Person[2];

        do {
            System.out.println("Enter customer name: ");
            customer_name = input.next();
            System.out.println("Enter customer age: ");
            customer_age = input.nextInt();
            System.out.println("Enter customer balance: ");
            customer_balance = input.nextDouble();
            Person new_person = new Person(customer_name, customer_age, customer_balance);
            personArray[counter] = new_person;
            counter++;

            System.out.println("Do you want to add another person? [Y:0/N:1]");
            quit = input.nextInt();


        }
        while (quit == 0);

        for(int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].getName());
            System.out.println(personArray[i].getAge());
            System.out.println((personArray[i]).getChecking_balance());
        }




    }
}