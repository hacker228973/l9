public class Student {
    private String name;
    private DayOfWeek onDuty;

    public Student(String name, DayOfWeek OnDuty) {
        this.name = name;
        this.onDuty = OnDuty;
    }

    public String getName() {
        return name;
    }

    public DayOfWeek getOnDuty() {
        return onDuty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scheduleAt=" + onDuty +
                '}';
    }
}
