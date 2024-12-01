
public class Manufacturing {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        Vehicle car = carFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        car.assemble();
        truck.assemble();
        motorcycle.assemble();
    }
    
}
