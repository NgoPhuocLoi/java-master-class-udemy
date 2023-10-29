package student_query;

public class LPAStudent extends Student {
    private double percentComplete;

    public LPAStudent() {
        super();
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return String.format("%s %8.1f%%", super.toString(), percentComplete);
    }
}
