import java.util.ArrayList;
import java.util.*;

public class studentGroup implements Iterable<Student> {
    private List<Student> students;

    public studentGroup(){
        this.students = new ArrayList<>();
    }

    public studentGroup(List<Student> students){
        this.students = students;
    }

    public void add(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
