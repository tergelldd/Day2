public class ParkingSystem {
    int[] slot;

    public ParkingSystem(int big, int medium, int small) {
        slot = new int[4];
        slot[1] = big;
        slot[2] = medium;
        slot[3] = small;
    }
    public boolean addCar(int carType) {
        if(slot[carType] > 0) {
            slot[carType] --;
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        ParkingSystem car1 = new ParkingSystem(1, 1, 0);
        boolean param_1 = car1.addCar(1);
        boolean param_2 = car1.addCar(2);
        boolean param_3 = car1.addCar(3);
        boolean param_4 = car1.addCar(1);
    }
}