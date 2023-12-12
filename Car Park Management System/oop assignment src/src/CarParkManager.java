public interface CarParkManager {   // create car park manager class as a interface

    // created the methods and variables with nobody
    final int totalVehicleSlots = 20;
    boolean vehicleEntered();
    int vehicleLeft();
    int getNumEmptySlots();
    int getNumOccupiedSlots();
}
