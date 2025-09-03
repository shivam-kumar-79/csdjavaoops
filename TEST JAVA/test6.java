abstract class customer {
    String name;
    String ID;
    int price;

    customer(String name, String ID,int price) {
        this.name = name;
        this.ID = ID;
        this.price=price;
    }
    void showDetails() {
        System.out.println("Name: " + name + ", ID " + ID + ", Fare Price: " + price);
    }
    abstract void Booking();
}
interface Refunds {
    void refund();
}


class customer extends customer implements Refunds {
    customer(String name, String ID, int price) {
        super();
    }

    @Override
    void Refunds() {
        int price;
        System.out.println(price-200 + "Refunded");
    }

}

class customer extends customer implements Refunds {
    Bus(String name, String ID, int price) {
        super();
    }

    @Override
    void Refunds() {
        int price;
        System.out.println(price-200 + "Refunded");
    }
}

class customer extends QuickRide implements Refunds {
    customer(String name, String ID,int price) {
        super();
    }

    @Override
    public void refund() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refund'");
    }
}
public class test6 {
    public static void main(String[] args) {
        customer s1 = new customer("Amit", "CAB101", 500);
        customer s2 = new ArtsStudent("Priya", "TRN202" ,1200);
        customer s3 = new SchoolStudent("Rahul", "BUS303",200);

        s1.showDetails(); s1.Refund();
        s2.showDetails(); s2.Refund();
        s3.showDetails(); s3.Refund();

    }
}