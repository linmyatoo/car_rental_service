import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //username input
        Scanner SignIn = new Scanner(System.in);
        System.out.println("Enter UserName");
        String username = SignIn.nextLine();

        // password input
        System.out.println("Enter your Password");
        String password = SignIn.nextLine();

        System.out.println(username+password);

        //call view car
        Car car = new Car();
        car.viewCar();

        System.out.println("aaaa");

    }
}