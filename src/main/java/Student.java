public class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;  // ascending order by marks
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}
