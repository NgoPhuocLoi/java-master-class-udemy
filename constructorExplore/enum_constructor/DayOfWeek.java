package enum_constructor;

public enum DayOfWeek {
    SUN("Sunday"), MON("Monday"), TUE("Tuesday"), WED("Wednesday"), THU("Thursday"), FRI("Friday"), SAT("Saturday");

    String name;

    DayOfWeek(String name) {
        this.name = name;
        System.out.println(this + " is initialized");
    }

    @Override
    public String toString() {
        return name;
    }
}
