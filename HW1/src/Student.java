public class Student {
    private String name;
    private double average;
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, double average) {
        this.name = name;
        this.average = average;
    }
    public double getAverage() {
        return average;
    }
}
