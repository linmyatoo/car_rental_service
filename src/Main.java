import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Scanner SignIn = new Scanner(System.in);
        System.out.println("1:Rent a car");
        System.out.println("2:Retrun a car");
        int choose = SignIn.nextInt();

        switch(choose){
            case 1:
                car.viewCar();
                break;
            case 2:
                System.out.println("retrun");
                break;
        }
        //username input
        System.out.println("Enter UserName");
        String username = SignIn.nextLine();

        // password input
        System.out.println("Enter your Password");
        String password = SignIn.nextLine();

        System.out.println(username+password);

        //call view car
        car.viewCar();

        System.out.println("aaaa");
        System.out.println("aaa");

    }
}