public class Sedan extends Car{
    public Sedan(){
        super("Chevrolet_Malibu", 2023,"Black", 2000);
    }

    public void viewcar(){
        super.viewCar();
    }

    public String cars(){
        super.cars();
        return super.getCarModel();
    }
}
