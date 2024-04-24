public class Car {
    private String carModel;
    private int year;
    private String carColor;
    private double carPricePerDay;

    public void Car(String carModel, int year, String carColor, double carPricePerDay){
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
       String[] carName = {"Ford_Everest", "Mitsubishi_Outlander", "Chevrolet_Malibu", "BMW_XM"};
       int[] year = {2023, 2023, 2023, 2023};
       String[] color = {"Black", "White", "Black", "Marina Bay Blue"};
       double[] pricePerDay = {2200, 2000, 2000, 3000};

       for(int i = 0; i < 4; i++){
           System.out.println(carName[i] + " " + color[i] + " " + year[i] + " " + pricePerDay[i]);
       }

    }
}

