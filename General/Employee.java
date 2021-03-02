package General;

/**
 * In General package define a class "employee" with data members as
 * empid(protected), ename(private) and a public method as earnings() which
 * calculate total earnings as earnings basic + DA (80% of basic) + HRA (15% of
 * basic)
 */
public class Employee {
    protected int empid;
    private String ename;
    private float basic;

    public Employee(int empid, String ename, float basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }

    public float earnings() {
        return basic + 0.8f * basic + 0.15f * basic;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEname() {
        return ename;
    }
}
