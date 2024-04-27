<<<<<<< HEAD
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> mhkaungpyae
=======
>>>>>>> mhkaungpyae
public class Car {
    private String carModel;
    private int year;
    private int id;
    private String carColor;
    private double carPricePerDay;

    public Car(String carModel, int year, String carColor, double carPricePerDay){

        this.carPricePerDay = carPricePerDay;
        this.carModel = carModel;
        this.carColor = carColor;
        this.year = year;
    }

    public void setCarModel(String carModel){
        this.carModel = carModel;
    }

    public String getCarModel(){
        return carModel;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setCarColor(String carColor){
        this.carColor = carColor;
    }

    public String getCarColor(){
        return carColor;
    }

    public void setCarPricePerDay(double carPricePerDay){
        this.carPricePerDay = carPricePerDay;
    }

    public double getCarPricePerDay(){
        return carPricePerDay;
    }

    public void viewCar(){
        System.out.println("Car Details:");
        System.out.println("Model: " + carModel);
        System.out.println("Color: " + carColor);
        System.out.println("Year: " + year);
        System.out.println("Price Per Day: " + carPricePerDay + " Baht");
    }
}