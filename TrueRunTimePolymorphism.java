// Method Overriding is run time polymorphism
// But there is a catch, it is all in perspective. 
// Lets run through an example

class PlaneParent {
    void takeOff() {
        System.out.println("PlaneParent: takeOff");
    }

    void fly() {
        System.out.println("PlaneParent: fly");
    }

    void landing() {
        System.out.println("PlaneParent: landing");
    }
}

class PassengerPlane extends PlaneParent {

    // These are overridden methods.
    void takeOff() {
        System.out.println("PassengerPlane: takeOff");
    }

    void fly() {
        System.out.println("PassengerPlane: fly");
    }

    void landing() {
        System.out.println("PassengerPlane: landing");
    }

    // These are specialized methods.
    void passengerBoard() {
        System.out.println("PassengerPlane: passengerBoard");
    }

    void passengerAlight() {
        System.out.println("PassengerPlane: passengerAlight");
    }
}

class CargoPlane extends PlaneParent {

    // These are overridden methods.
    void takeOff() {
        System.out.println("CargoPlane: takeOff");
    }

    void fly() {
        System.out.println("CargoPlane: fly");
    }

    void landing() {
        System.out.println("CargoPlane: landing");
    }

    // These are specialized methods.
    void cargoLoaded() {
        System.out.println("CargoPlane: passengerBoard");
    }

    void cargoUnloaded() {
        System.out.println("CargoPlane: passengerAlight");
    }
}

public class TrueRunTimePolymorphism {
    public static void main(String[] args) {
        // Child Ref assigned with child object. 
        PassengerPlane passengerPlane = new PassengerPlane();
        CargoPlane cargoPlane = new CargoPlane();
        // Calling passenger plane
        System.out.println("************************");
        passengerPlane.passengerBoard();
        passengerPlane.takeOff();
        passengerPlane.fly();
        passengerPlane.landing();
        passengerPlane.passengerAlight();
        System.out.println("************************");
        // Calling Cargo plane
        cargoPlane.cargoLoaded();
        cargoPlane.takeOff();
        cargoPlane.fly();
        cargoPlane.landing();
        cargoPlane.cargoUnloaded();
        System.out.println("************************");
        /* As we can see above, the overridden methods are called using the child reference but this does not achieve true/run time polymorphism, since the implementation of methods in objects are directly called. */

        
        /* True/Run time polymorphism is achieved when using the parent type reference to invoke the function of the child. */
        PlaneParent planeParent;
        planeParent = new PassengerPlane();
        
        // Calling passenger plane
        System.out.println("************************");
        ((PassengerPlane)planeParent).passengerBoard();
        planeParent.takeOff();
        planeParent.fly();
        planeParent.landing();
        ((PassengerPlane)planeParent).passengerAlight();
        // Calling Cargo plane
        System.out.println("************************");
        planeParent = new CargoPlane();
        ((CargoPlane)planeParent).cargoLoaded();
        planeParent.takeOff();
        planeParent.fly();
        planeParent.landing();
        ((CargoPlane)planeParent).cargoUnloaded();
        System.out.println("************************");

        /* As we can see above, the takoff, fly, land which is overridden in child objects are actually called using only one reference type of parent. JVM determines at run time which overridden function to call. This can optimized by moving the takeOff, fly, landing functions to a separate functions. */

    }
}
