import java.util.Scanner;
public class CarRentConfirmation {
    public void confirm(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Do you want to rent this car: y/n");
        String choice = keyboard.nextLine().toLowerCase();
        if (choice .equals("y")){
            System.out.println("How would you like to pay?");
            System.out.print("1: Cash \n2: Prompt Pay \n3: Credit Card");
            int paychoice = keyboard.nextInt();
            switch (paychoice){
                case 1:
                    System.out.println("Your confirmation is completed!!! \nYou can pay when you take it");
                    break;
                case 2:
                    System.out.println("Transfer money to this number");
                    System.out.println(746389299);
                    break;
                case 3:
                    System.out.println("Fill your Name On Card");
                    Scanner scn = new Scanner(System.in);
                    scn.nextLine();
                    System.out.println("Fill your card number");
                    keyboard.nextInt();
                    System.out.println("Payment successful!!!");
                    break;
            }
        }
        else {
                RentalCar rc = new RentalCar();
                rc.carChoice();
        }
    }
}
