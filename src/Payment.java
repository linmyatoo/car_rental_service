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

    public void paymentAmountSUV(){
        Car car = new Suv();
        double price = car.getCarPricePerDay();
        paymentAmount = (dayCount*price) + insurance;
        System.out.println("Your total amount will be " + paymentAmount);
    }

    public void paymentAmountSportType(){
        Car car = new SportType();
        double price = car.getCarPricePerDay();
        paymentAmount = (dayCount*price) + insurance;
        System.out.println("Your total amount will be " + paymentAmount);
    }

    public void paymentAmountOffRoad(){
        Car car = new OffRoad();
        double price = car.getCarPricePerDay();
        paymentAmount = (dayCount*price) + insurance;
        System.out.println("Your total amount will be " + paymentAmount);
    }

    public void paymentAmountSedan(){
        Car car = new Sedan();
        double price = car.getCarPricePerDay();
        paymentAmount = (dayCount*price) + insurance;
        System.out.println("Your total amount will be " + paymentAmount);
    }
}
