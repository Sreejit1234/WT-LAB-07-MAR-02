/**
 * Define an interface Motor with a data member –capacity and two methods such
 * as run() and consume(). Define a Java class "Washing machine" which
 * implements this interface and write the code to check the value of the
 * interface data member thru an object of the class
 */
public class q2 {
    public static void main(String[] args) {
        WashingMachine obj = new WashingMachine();
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
            obj.run();
            obj.consume();
            System.out.println("Current Capacity: " + obj.newCapacity);
            System.out.println("*****");
        }

    }
}

interface Motor {
    int capacity = 100;

    void run();

    void consume();
}

class WashingMachine implements Motor {

    int newCapacity = capacity;

    @Override
    public void run() {
        if (newCapacity > 0) {
            System.out.println("Is running");
        } else {
            System.out.println("Cannot Run");
        }

    }

    @Override
    public void consume() {
        int consumptionRate = 1;
        if (newCapacity > 0) {
            newCapacity -= consumptionRate;
            System.out.println("Consumed : " + consumptionRate);
        } else {
            System.out.println("Nothing to consume");
        }
    }

}
