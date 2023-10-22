public class Employee extends Worker {
    private String hiredDate;
    private long employeeId;

    private static long employeeNo = 1;

    public Employee(String name, String birthDate, String hiredDate) {
        super(name, birthDate);
        this.employeeId = employeeNo++;
        this.hiredDate = hiredDate;
    }

    public long getEmployeeId() {
        return this.employeeId;
    }

    public String getHiredDate() {
        return this.hiredDate;
    }

    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return "{" +
                " employeeId='" + getEmployeeId() + "'" +
                ", hiredDate='" + getHiredDate() + "'" +
                "}" + super.toString();
    }

}