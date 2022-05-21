
import java.util.Comparator;
import java.util.TreeSet;

public class Birds {
    public static void main(String[] args) {

        Comparator<Bird> comparator= new BirdComparator();
        TreeSet<Bird> birds = new TreeSet<>(comparator);
        birds.add(new Bird("red"));
        birds.add(new Bird("orange"));
        birds.add(new Bird("yellow"));
        birds.add(new Bird("green"));
        birds.add(new Bird("cyan"));
        birds.add(new Bird("blue"));
        birds.add(new Bird("violet"));
        System.out.println(birds);
    }
}
