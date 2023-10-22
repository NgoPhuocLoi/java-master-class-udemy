import java.time.Year;

public class Worker {
    private String name, birthDay, endDate;

    public Worker(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public int getAge() {
        return Year.now().getValue() - Integer.parseInt(birthDay.split("/")[birthDay.split("/").length - 1]);
    }

    public double collectPay() {
        return 0;
    }

    public void terminate(String endDate) {
        setEndDate(endDate);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", birthDay='" + getBirthDay() + "'" +
                ", endDate='" + getEndDate() + "'" +
                "}";
    }

}