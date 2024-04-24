public class SportType extends Car{
    public SportType() {
        super("BMW_i8", 2022, "Gray", 3000);
    }

    public void viewCar(){
        super.viewCar();
    }

    public String cars(){
        super.cars();
        return super.getCarModel();
    }
}
