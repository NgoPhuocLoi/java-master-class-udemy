public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hiredDate,
            double annualSalary) {
        super(name, birthDate, hiredDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire() {
        isRetired = true;
    }

    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isIsRetired() {
        return this.isRetired;
    }

    public boolean getIsRetired() {
        return this.isRetired;
    }

    public void setIsRetired(boolean isRetired) {
        this.isRetired = isRetired;
    }

}