public class SportType extends Car{
    public SportType(Car car) {
        super(car.getCarModel(),car.getYear(),car.getCarColor(),car.getCarPricePerDay());

    }

    public void viewCar(){
        super.viewCar();
    }


}
