/**
 * Inheritance
 */
enum EAeroplaneType {
    COMMERCIAL,
    PRIVATE,
    GOVERNMENT
}
class AeroplaneType {
    private Boolean isPrivate = false, isGovernmentOwned = false;
    private AeroplaneType() {

    }

    protected AeroplaneType(EAeroplaneType typeOfAeroplane) {
        if(typeOfAeroplane == EAeroplaneType.PRIVATE) {
            setIsPrivate(true);
        } else if(typeOfAeroplane == EAeroplaneType.GOVERNMENT) {
            setIsGovernmentOwned(true);
        }
    }

    private void setIsGovernmentOwned(Boolean isGovernmentOwned) {
        this.isGovernmentOwned = isGovernmentOwned;
    }

    private void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    protected EAeroplaneType aeroplaneType() {
        if(isPrivate) {
            return EAeroplaneType.PRIVATE;
        } else if(isGovernmentOwned) {
            return EAeroplaneType.COMMERCIAL;
        }
        return EAeroplaneType.COMMERCIAL;
    }


}

class Aeroplane {
    private AeroplaneType aeroplaneType;
    private Integer numberOfEngines, numberOfTyres, modelNumber, seatingCapacity, fuelCapacity, numberOfPilot, numberOfCrew;
    private String modelName;
    public Aeroplane(EAeroplaneType typeOfAeroplane, Integer numberOfEngines, Integer numberOfTyres, Integer modelNumber, Integer seatingCapacity, Integer fuelCapacity, Integer numberOfPilot, Integer numberOfCrew, String modelName) {
        setAeroPlaneType(typeOfAeroplane);
        setNumberOfEngines(numberOfEngines != null ? numberOfEngines : 2);
        setNumberOfTyres(numberOfTyres != null ? numberOfTyres : 6);
        setModelNumber(modelNumber != null ? modelNumber : (int)Math.random());
        setSeatingCapacity(seatingCapacity != null ? seatingCapacity : 2);
        setFuelCapacity(fuelCapacity != null ? fuelCapacity : 100);
        setNumberOfPilot(numberOfPilot != null ? numberOfPilot : 2);
        setNumberOfCrew(numberOfCrew != null ? numberOfCrew : 2);
        setModelName(modelName != null ? modelName : "Random Model Name " + Math.random());
    }
    private void setAeroPlaneType(EAeroplaneType typeOfAeroplane) {
        aeroplaneType = new AeroplaneType(typeOfAeroplane);
    }

    public EAeroplaneType getAeroplaneType() {
        return aeroplaneType.aeroplaneType();
    }
    private void setNumberOfEngines(Integer numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }
    protected void setNumberOfTyres(Integer numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }
    private void setModelNumber(Integer modelNumber) {
        this.modelNumber = modelNumber;
    }
    protected void setSeatingCapacity(Integer seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    private void setFuelCapacity(Integer fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    protected void setNumberOfPilot(Integer numberOfPilot) {
        this.numberOfPilot = numberOfPilot;
    }
    protected void setNumberOfCrew(Integer numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }
    protected void setModelName(String modelName) {
        this.modelName = modelName;
    }
}

class CommercialPlane extends Aeroplane {

    public CommercialPlane(Integer numberOfEngines, Integer numberOfTyres, Integer modelNumber,
            Integer seatingCapacity, Integer fuelCapacity, Integer numberOfPilot, Integer numberOfCrew,
            String modelName) {
        super(EAeroplaneType.COMMERCIAL, numberOfEngines, numberOfTyres, modelNumber, seatingCapacity, fuelCapacity, numberOfPilot,
                numberOfCrew, modelName);
        System.out.println("Commercial plane created!");
    }

    @Override
    public void setNumberOfPilot(Integer numberOfPilot) {
        super.setNumberOfPilot(numberOfPilot);
    }

    @Override
    public void setNumberOfCrew(Integer numberOfCrew) {
        super.setNumberOfCrew(numberOfCrew);
    }

    @Override
    public void setModelName(String modelName) {
        super.setModelName(modelName);
    }

    @Override
    public void setSeatingCapacity(Integer seatingCapacity) {
        super.setSeatingCapacity(seatingCapacity);
    }
    

}

class PrivatePlane extends Aeroplane {

    public PrivatePlane(Integer numberOfEngines, Integer numberOfTyres, Integer modelNumber,
            Integer seatingCapacity, Integer fuelCapacity, Integer numberOfPilot, Integer numberOfCrew,
            String modelName) {
        super(EAeroplaneType.PRIVATE, numberOfEngines, numberOfTyres, modelNumber, seatingCapacity, fuelCapacity, numberOfPilot,
                numberOfCrew, modelName);
                System.out.println("Private plane created!");
    }

    @Override
    public void setNumberOfPilot(Integer numberOfPilot) {
        super.setNumberOfPilot(numberOfPilot);
    }

    @Override
    public void setNumberOfCrew(Integer numberOfCrew) {
        super.setNumberOfCrew(numberOfCrew);
    }

    @Override
    public void setModelName(String modelName) {
        super.setModelName(modelName);
    }

    @Override
    public void setSeatingCapacity(Integer seatingCapacity) {
        super.setSeatingCapacity(seatingCapacity);
    }

}

class GovernmentPlane extends Aeroplane {

    public GovernmentPlane(Integer numberOfEngines, Integer numberOfTyres, Integer modelNumber,
            Integer seatingCapacity, Integer fuelCapacity, Integer numberOfPilot, Integer numberOfCrew,
            String modelName) {
        super(EAeroplaneType.GOVERNMENT, numberOfEngines, numberOfTyres, modelNumber, seatingCapacity, fuelCapacity, numberOfPilot,
                numberOfCrew, modelName);
        System.out.println("Government plane created!");
    }

    @Override
    public void setNumberOfPilot(Integer numberOfPilot) {
        super.setNumberOfPilot(numberOfPilot);
    }

    @Override
    public void setNumberOfCrew(Integer numberOfCrew) {
        super.setNumberOfCrew(numberOfCrew);
    }

    @Override
    public void setModelName(String modelName) {
        super.setModelName(modelName);
    }

    @Override
    public void setSeatingCapacity(Integer seatingCapacity) {
        super.setSeatingCapacity(seatingCapacity);
    }

}



public class Inheritance {

    public static void main(String[] args) {
        //Acquire a private plane
        PrivatePlane privatePlane = new PrivatePlane(null, null, null, null, null, null, null, null);
        

        //Acquire government plane
        GovernmentPlane governmentPlane = new GovernmentPlane(null, null, null, null, null, null, null, null);

        //Acquire commercial plane
        CommercialPlane commercialPlane = new CommercialPlane(null, null, null, null, null, null, null, null);
        System.out.println("Aeroplane Type: " + commercialPlane.getAeroplaneType());
    }
}