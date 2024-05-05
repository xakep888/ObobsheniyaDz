import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Potok implements Iterable<studentGroup> {

    @Override
    public Iterator<studentGroup> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super studentGroup> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<studentGroup> spliterator() {
        return Iterable.super.spliterator();
    }
}
