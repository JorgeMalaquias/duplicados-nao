import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner inputVar = new Scanner(System.in);
        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();

        array1.add("morango");
        array1.add("maçã");
        array1.add("pêra");
        array1.add("banana");

        array2.add("melancia");
        array2.add("morango");
        array2.add("banana");
        array2.add("abacate");

        for (int i = 0; i < array1.size(); i++) {
            if (array2.contains(array1.get(i))) {
                System.out.println(array1.get(i));
            }

        }
    }
}
