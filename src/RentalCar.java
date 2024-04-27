import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class RentalCar {
    public void carChoice() {
        System.out.println("Choose car type you want to rent: ");
        System.out.print("1. SUV\n2. SportType\n3. OffRoad\n4. Sedan");
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        try{
            int choice = keyboard.nextInt();

            Payment pay = new Payment();
            CarRentalComfirmation crc = new CarRentalComfirmation();
            ArrayList<Car> carlist = new ArrayList<>();
            carlist.add(new Car("Ford_Everest", 2023, "Red", 2000));
            carlist.add(new Car("BMW_i8", 2022, "Gray", 3000));
            carlist.add(new Car("Mitsubishi_Xpander", 2023, "White", 2000));
            carlist.add((new Car("Ford_Everest", 2023, "Red", 2000)));

            switch (choice) {
                case 1:

                    Car suvCar = new Suv(carlist.get(1));
                    suvCar.viewCar();
                    pay.paymentAmount(suvCar);
                    break;
                case 2:
                    Car sportCar = new SportType(carlist.get(2));
                    sportCar.viewCar();
                    pay.paymentAmount(sportCar);
                    break;
                case 3:

                    Car offRoadCar = new OffRoad(carlist.get(3));
                    offRoadCar.viewCar();
                    pay.paymentAmount(offRoadCar);
                    break;
                case 4:

                    Car sedanCar = new Sedan(carlist.get(4));
                    sedanCar.viewCar();
                    pay.paymentAmount(sedanCar);
                    break;
                default:
                    System.out.println("Choose only available cars");
                    carChoice();
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("choose in number format");
            carChoice();
        }

    }


}