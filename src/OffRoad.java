public class OffRoad extends Car{

    public OffRoad(Car car) {
        super(car.getCarModel(), car.getYear(), car.getCarColor(), car.getCarPricePerDay());
    }

    public void viewCar(){
        super.viewCar();
    }
}