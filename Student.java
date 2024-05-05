public class Student extends User implements Comparable<Student> {
    private Integer studentId;


    public Student(Integer studentId, String firstName, String lastName, String secondName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;

    }

    public int getStudentId() {
        return studentId;
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return studentId.compareTo(o.getStudentId());
    }
}
