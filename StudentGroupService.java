
import java.util.*;

public class StudentGroupService {
    private studentGroup students;

    public StudentGroupService(studentGroup students) {
        this.students = students;
    }

    public studentGroup getStudents() {
        return students;
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = new ArrayList<>(students.getStudents());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentGroupFio(){
        List<Student> studentList = new ArrayList<>(students.getStudents());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }
}
