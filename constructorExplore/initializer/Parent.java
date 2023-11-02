package initializer;

public class Parent {
    private final String name;
    private final String dob;

    static {
        System.out.println("Static inilizier in Parent class");
    }

    {
        name = "Ngo Phuoc Loi";
        dob = "25/11/2003";
        System.out.println("Final field initializations");
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + name + "'" +
                ", dob='" + dob + "'" +
                "}";
    }

}
