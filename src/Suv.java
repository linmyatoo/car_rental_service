public class Suv extends Car{

    public Suv() {
        super("Ford_Everest", 2023, "Red", 2000);
    }

    public void viewCar(){
        super.viewCar();
    }

    public String cars(){
        super.cars();
        return super.getCarModel();
    }
}
