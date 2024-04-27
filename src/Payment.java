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
        double price = car.getCarPricePerDay();
        paymentAmount = (dayCount * price) + insurance;
        System.out.println("Your total amount will be " + paymentAmount);
    }

    public void processPaymentSUV(){
        Car suv = new Suv();
        paymentAmount(suv);
    }

    public void processPaymentSportType(){
        Car sportType = new SportType();
        paymentAmount(sportType);
    }

    public void processPaymentSedan(){
        Car sedan = new Sedan();
        paymentAmount(sedan);
    }

    public void processPaymentOffRoad(){
        Car offRoad = new OffRoad();
        paymentAmount(offRoad);
    }

}
