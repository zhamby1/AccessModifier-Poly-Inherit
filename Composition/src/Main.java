//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car mycar = new Car("Ford","Mustang",2020);
        System.out.println(mycar.getMake());
        System.out.println(mycar.getModel());
        System.out.println(mycar.getYear());
        mycar.myengine.beep_beep();


    }
}