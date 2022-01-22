package 컬렉션프레임워크;
import java.util.*;

public class LinkedLIstTest {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Black", "White", "Green", "Red"));
        String removedColor = colors.remove(0);
        System.out.println("Removed color is " + removedColor);

        colors.remove("White");
        System.out.println(colors);

        colors.clear();
        System.out.println(colors);
    }
}

