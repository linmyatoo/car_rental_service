import java.util.Scanner;
public class RentalCar {
    public void carPayment() {
        System.out.println("Choose car type you want to rent: ");
        System.out.print("1. SUV\n2. SportType\n3. OffRoad\n4. Sedan");
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        switch (choice) {
            case 1:
                Car suvCar = new Suv();
                suvCar.viewCar();
                Payment pay = new Payment();
                System.out.println("How many days do you want to rent? ");
                pay.dayCount = keyboard.nextInt();
                pay.paymentAmountSUV();
                break;
            case 2:
                Car sportCar = new SportType();
                sportCar.viewCar();
                Payment pay1 = new Payment();
                System.out.println("How many days do you want to rent? ");
                pay1.dayCount = keyboard.nextInt();
                pay1.paymentAmountSUV();
                break;
            case 3:
                Car offRoadCar = new OffRoad();
                offRoadCar.viewCar();
                Payment pay2 = new Payment();
                System.out.println("How many days do you want to rent? ");
                pay2.dayCount = keyboard.nextInt();
                pay2.paymentAmountSUV();
                break;
            case 4:
                Car sedanCar = new Sedan();
                sedanCar.viewCar();
                Payment pay3 = new Payment();
                System.out.println("How many days do you want to rent? ");
                pay3.dayCount = keyboard.nextInt();
                pay3.paymentAmountSUV();
                break;
        }
    }
}
