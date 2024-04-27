import java.util.Scanner;
public class RentalCar {
    public void carChoice() {
        System.out.println("Choose car type you want to rent: ");
        System.out.print("1. SUV\n2. SportType\n3. OffRoad\n4. Sedan");
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        Payment pay = new Payment();
        CarRentConfirmation crc = new CarRentConfirmation();
        switch (choice) {
            case 1:
                Car suvCar = new Suv();
                suvCar.viewCar();
                System.out.println("How many days do you want to rent? ");
                pay.dayCount = keyboard.nextInt();
                pay.processPaymentSUV();
                crc.confirm();
                break;
            case 2:
                Car sportCar = new SportType();
                sportCar.viewCar();
                System.out.println("How many days do you want to rent? ");
                pay.dayCount = keyboard.nextInt();
                pay.processPaymentSportType();
                crc.confirm();
                break;
            case 3:
                Car offRoadCar = new OffRoad();
                offRoadCar.viewCar();
                System.out.println("How many days do you want to rent? ");
                pay.dayCount = keyboard.nextInt();
                pay.processPaymentOffRoad();
                crc.confirm();
                break;
            case 4:
                Car sedanCar = new Sedan();
                sedanCar.viewCar();
                System.out.println("How many days do you want to rent? ");
                pay.dayCount = keyboard.nextInt();
                pay.processPaymentSedan();
                crc.confirm();
                break;
        }
    }
}
