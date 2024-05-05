import java.util.Iterator;
import java.util.*;
public class StudentGroupIterator implements Iterator<Student>{
    private final List<Student> students;
    private int counter;

    public StudentGroupIterator(studentGroup students) {
        this.students = students.getStudents();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if(hasNext())
            return students.get(counter++);
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
             students.remove(counter);
    }
}
