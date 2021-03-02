package Marketing;

import General.Employee;

/**
 * In Marketing package define a class "sales" which is extending from
 * "employee" class and has a method tallowance() which calculates Travelling
 * Allowance as 5% of total earning.
 */
public class Sales extends Employee {
    public Sales(int empid, String ename, float basic) {
        super(empid, ename, basic);
    }

    public float tallowance() {
        return 0.5f * earnings();
    }
}
