import java.util.Scanner;

/**
 * Define an interface with three methods – earnings(), deductions() and bonus()
 * and define a Java class "Manager" which uses this interface without
 * implementing bonus() method. Also define another Java class "Substaff" which
 * extends from "Manager" class and implements bonus() method. Write the
 * complete program to find out earnings, deduction and bonus of a sbstaff with
 * basic salary amount entered by the user as per the following guidelines –
 * Earnings = basic + DA (80% of basic) + HRA (15% of basic) deduction PF = 12%
 * of basic bonus = 50% of basic
 */

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter substaff basic salary: Rs. ");
        float basic = sc.nextFloat();
        Substaff obj = new Substaff(basic);

        System.out.println(" Earnings: Rs. " + obj.earnings());
        System.out.println("Deduction: Rs. " + obj.deductions());
        System.out.println("    Bonus: Rs." + obj.bonus());

        sc.close();
    }
}

interface Account {
    float earnings();

    float deductions();

    default float bonus() {
        return 0;
    }
}

class Manager implements Account {
    float basic, da, hra;

    Manager(float basic) {
        this.basic = basic;
        da = 0.8f * this.basic;
        hra = 0.15f * this.basic;
    }

    @Override
    public float earnings() {
        return basic + da + hra;
    }

    @Override
    public float deductions() {
        return 0.12f * basic;
    }
}

class Substaff extends Manager implements Account {

    Substaff(float basic) {
        super(basic);
    }

    @Override
    public float bonus() {
        return 0.5f * basic;
    }
}
