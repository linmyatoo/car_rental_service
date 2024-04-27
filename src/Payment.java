//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Payment {
    private double paymentAmount;
    public int dayCount;
    private double insurance = 3000.0;

    public Payment() {
    }

    public void setPaymentAmount() {
        this.paymentAmount = this.paymentAmount;
    }

    public double getPaymentAmount() {
        return this.paymentAmount;
    }

    public double getInsurance() {
        return this.insurance;
    }

    public void paymentAmount(Car car) {
        System.out.println("How many days do you want to rent? ");
        Scanner keyboard = new Scanner(System.in);
        this.dayCount = keyboard.nextInt();
        double price = car.getCarPricePerDay();
        this.paymentAmount = (double)this.dayCount * price + this.insurance;
        System.out.println("Your total amount will be " + this.paymentAmount);
        CarRentalComfirmation crc = new CarRentalComfirmation();
        boolean comfirmdata = crc.confirm();
        if (comfirmdata) {
            this.receipt(car.getCarModel(), price, this.paymentAmount);
        }

    }

    public void receipt(String carModel, double price, double paymentAmount) {
        try {
            FileWriter fw = new FileWriter("info.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String data = "CarModel :" + carModel + "\nPrice Per day :" + price + "\npaymentAmount :" + paymentAmount;
            bw.write(data);
            System.out.println("you receipt is out");
            bw.close();
        } catch (IOException var9) {
            IOException e = var9;
            System.out.println(e.getMessage());
        }

    }
}
