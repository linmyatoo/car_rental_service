public class Suv extends Car{
    public Suv(Car car) {
        super(car.getCarModel(),car.getYear(),car.getCarColor(),car.getCarPricePerDay());
    }

    public void viewCar(){
        super.viewCar();
    }



}