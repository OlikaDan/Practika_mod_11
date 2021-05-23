import java.util.Comparator;

public class PartComparatorName implements Comparator<Participants> {

    @Override
    public int compare(Participants o1, Participants o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
