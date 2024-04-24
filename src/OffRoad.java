public class OffRoad extends Car{

    public OffRoad() {
        super("Mitsubishi_Xpander", 2023, "White", 2000);
    }

    public void viewCar(){
        super.viewCar();
    }

    public String cars(){
        super.cars();
        return super.getCarModel();
    }
}
