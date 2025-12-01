public class Student {
    // 1. Encapsulation: Private fields
    private String id;
    private String name;
    private double gpa;

    // 2. Constructors (Overloading)
    public Student() {}

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // 3. Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    // 4. Overriding toString để in đối tượng đẹp hơn
    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-5.2f |", id, name, gpa);
    }
}
