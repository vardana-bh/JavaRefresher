//Compile time polymorphism

class Plane {
    void takeoff() {
        System.out.println("Plane: takeoff");
    }

    void landing() {
        System.out.println("Plane: landing");
    }
}

class CargoPlane extends Plane {
    void takeoff() {
        System.out.println("CargoPlane: takeoff");
    }

    void landing() {
        System.out.println("CargoPlane: landing");
    }

    void fly() {
        System.out.println("CargoPlane: fly");
    }
}

class PassengerPlane extends Plane {

    void landing() {
        System.out.println("PassengerPlane: landing");
    }

    void fly() {
        System.out.println("PassengerPlane: fly");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Plane cp = new CargoPlane();
        cp.takeoff();
        ((CargoPlane)cp).fly();
        cp.landing();

        Plane pp = new PassengerPlane();   
        pp.takeoff();
        pp.landing();
    }
    
}
