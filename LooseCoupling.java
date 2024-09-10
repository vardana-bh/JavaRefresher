// Example of milk subscription


interface MilkCompany {
    void deliver();
    default void isNotSubscribed() {
        System.out.println(" You are not subscribed, please subscribe to a company ");
    }
}

class Nandini implements MilkCompany {

    @Override
    public void deliver() {
        System.out.println("Nandini Milk will be delivered");
    }
    
}

class Gokul implements MilkCompany {

    @Override
    public void deliver() {
        System.out.println("Gokul Milk will be delivered");
    }
    
}

class Amul implements MilkCompany {

    @Override
    public void deliver() {
        System.out.println("Amul Milk will be delivered");
    }
    
}

class Milk {
    private Boolean isSubscribed = false;
    void deliver(MilkCompany company) {
        if(this.isSubscribed) {
            company.deliver();
        } else {
            company.isNotSubscribed();
        }
    }
    void isMilkSubscribed(Boolean isSubscribed) {
        if(isSubscribed) {
            this.isSubscribed = isSubscribed;
        }
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        Milk userOneMilk = new Milk();
        userOneMilk.isMilkSubscribed(true);
        userOneMilk.deliver(new Nandini());
    }
}
