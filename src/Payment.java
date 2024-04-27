import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Payment {
    private double paymentAmount;
    public int dayCount;
    private double insurance = 3000.0;

    public void setPaymentAmount(){
        this.paymentAmount = paymentAmount;
    }

    public double getPaymentAmount(){
        return paymentAmount;
    }

    public double getInsurance(){
        return insurance;
    }

    public void paymentAmount(Car car){
        System.out.println("How many days do you want to rent? ");
        Scanner keyboard = new Scanner(System.in);
        dayCount = keyboard.nextInt();
        double price = car.getCarPricePerDay();
        paymentAmount = (dayCount * price) + insurance;
        System.out.println("Your total amount will be " + paymentAmount);
        CarRentalComfirmation crc = new CarRentalComfirmation();
        boolean comfirmdata = crc.confirm();
        if(comfirmdata){
            receipt(car.getCarModel(),price,paymentAmount);
        }
    }

    public void receipt(String carModel,double price,double paymentAmount){
        try{
            FileWriter fw = new FileWriter("info.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            {
                String data = "CarModel :"+carModel +"\n" + "Price Per day :" +price + "\n" + "paymentAmount :" +paymentAmount  ;
                bw.write(data);
                System.out.println("you receipt is out");
                bw.close();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}