import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Penguin");
        strings.add("Fox");
        strings.add("Bunny");
        strings.add("Wolf");
        strings.add("Bear");

        strings.remove(2);
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);

    }
}
